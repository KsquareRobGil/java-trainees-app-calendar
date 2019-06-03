package com.ksquareinc.calendar.model;

import javax.persistence.*;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Event eventCreated;

    @ManyToOne
    private Event eventInvitation;

    private Long ssoId = -1L;

    private String username;

    private String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSsoId() {
        return ssoId;
    }

    public void setSsoId(Long ssoId) {
        this.ssoId = ssoId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Event getEventCreated() {
        return eventCreated;
    }

    public void setEventCreated(Event eventCreated) {
        this.eventCreated = eventCreated;
    }

    public Event getEventInvitation() {
        return eventInvitation;
    }

    public void setEventInvitation(Event eventInvitation) {
        this.eventInvitation = eventInvitation;
    }
}

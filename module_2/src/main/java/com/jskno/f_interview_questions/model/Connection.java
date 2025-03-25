package com.jskno.f_interview_questions.model;

public class Connection {

    private final String timestamp;
    private final int member1;
    private final int member2;

    public Connection(String timestamp, int member1, int member2) {
        this.timestamp = timestamp;
        this.member1 = member1;
        this.member2 = member2;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public int getMember1() {
        return member1;
    }

    public int getMember2() {
        return member2;
    }
}

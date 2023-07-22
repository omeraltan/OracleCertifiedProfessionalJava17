package org.ocp.studies.chapter05;

public class Test27_Passing_Data_Among_Methods {
    public static void main(String[] args) {
        int tickets = 2;
        String guests = "abc";
        addTickets(tickets);
        guests = addGuests(guests);
        System.out.println(tickets + guests);
    }
    public static int addTickets(int tickets) {
        tickets++;
        return tickets;
    }

    public static String addGuests(String guests) {
        guests += "d";
        return guests;
    }
}

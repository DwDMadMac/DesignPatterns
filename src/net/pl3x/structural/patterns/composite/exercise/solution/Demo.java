package net.pl3x.structural.patterns.composite.exercise.solution;

/*
 * Building ann app for incident management organization
 *
 * When an incident occurs, one or more teams amy be deployed to attack the incident
 * A team often includes a truck and one or more human resources.
 * It can also include a sub team.
 *
 * Example:
 * For a medium-sized incident, we may need to deploy two teams and each
 * team may contain a truck and two persons.
 *
 * Team
 * -> Sub Team 1
 * -> -> Truck
 * -> -> Human Resource
 * -> -> Human Resource
 * -> Sub Team 2
 * -> -> Truck
 * -> -> Human Resource
 * -> -> Human Resource
 *
 * What are the problems with this implementation?
 * -> This implementation requires you to check the what type of object we are dealing with before
 *    it can be deployed
 */
public class Demo {
    public static void show() {
        var subTeam1 = new Team();
        subTeam1.add(new Truck());
        subTeam1.add(new HumanResource());
        subTeam1.add(new HumanResource());

        var subTeam2 = new Team();
        subTeam2.add(new Truck());
        subTeam2.add(new HumanResource());
        subTeam2.add(new HumanResource());

        var team = new Team();
        team.add(subTeam1);
        team.add(subTeam2);

        //team.deploy();
    }
}
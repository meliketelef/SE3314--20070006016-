package org.example;


import java.util.ArrayList;

    public class Quest {
        // Encapsulation: Make fields private to restrict external access.
        private String questName;
        private Character leader;
        private ArrayList<Character> participants;
        private MiddleEarthMap map;

        public Quest(String questName, Character leader, MiddleEarthMap map) {
            // Correct Assignment: Initialize instance variables with the provided parameters.
            this.questName = questName;
            this.leader = leader;
            this.map = map;
            this.participants = new ArrayList<>();
        }

        // Access Methods: Provide controlled access to the fields.
        public String getQuestName() {
            return questName;
        }

        public Character getLeader() {
            return leader;
        }

        public ArrayList<Character> getParticipants() {
            return new ArrayList<>(participants); // Encapsulation: Return a copy to protect the original list.
        }

        public MiddleEarthMap getMap() {
            return map;
        }

        // Participant Management: Add a new participant to the quest.
        public void addParticipant(Character character) {
            participants.add(character);
        }

        // Quest Execution: Display detailed information about the quest.
        public void start() {
            System.out.println("Starting quest: " + questName);
            System.out.println("Leader: " + leader.getName()); // Assumes Character class has a getName method.
            System.out.println("Participants:");
            for (Character participant : participants) {
                System.out.println(participant.getName() + ", age: " + participant.getAge()); // Show relevant attributes.
            }
            System.out.println("Map locations:");
            for (String location : map.getLocations()) { // Safely access map locations using a getter.
                System.out.println(location);
            }
        }
    }

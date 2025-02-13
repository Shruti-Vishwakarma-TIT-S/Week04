package com.collections.votingsystem;

import java.util.*;

public class VotingSystem {

    // Using HashMap to store votes (Candidate -> Votes)
    private Map<Candidate, Integer> votesMap = new HashMap<>();

    // Using LinkedHashMap to maintain the order of votes
    private Map<Candidate, Integer> orderedVotesMap = new LinkedHashMap<>();

    // Method to cast a vote for a candidate
    public void castVote(Candidate candidate) {
        // Update votes in HashMap
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);

        // Update votes in LinkedHashMap
        orderedVotesMap.put(candidate, orderedVotesMap.getOrDefault(candidate, 0) + 1);
    }

    // Method to display results in sorted order using TreeMap
    public void displayResults() {
        // Create a TreeMap to store votes sorted by candidate name
        TreeMap<Candidate, Integer> sortedVotesMap = new TreeMap<>(Comparator.comparing(Candidate::getName));
        sortedVotesMap.putAll(votesMap);

        System.out.println("Voting Results (Sorted Order):");
        for (Map.Entry<Candidate, Integer> entry : sortedVotesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    // Method to display ordered votes using LinkedHashMap
    public void displayOrderedVotes() {
        System.out.println("Voting Results (Order of Votes):");
        for (Map.Entry<Candidate, Integer> entry : orderedVotesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Create sample candidates
        Candidate candidate1 = new Candidate("Aman");
        Candidate candidate2 = new Candidate("Omish");
        Candidate candidate3 = new Candidate("Chandan");

        // Cast votes
        votingSystem.castVote(candidate1);
        votingSystem.castVote(candidate2);
        votingSystem.castVote(candidate1);
        votingSystem.castVote(candidate3);
        votingSystem.castVote(candidate2);

        // Display results in sorted order
        votingSystem.displayResults();

        // Display ordered votes
        votingSystem.displayOrderedVotes();
    }
}

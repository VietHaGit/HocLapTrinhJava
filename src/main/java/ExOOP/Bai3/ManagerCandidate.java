package ExOOP.Bai3;

import ExOOP.Bai2.ManagerDocument;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerCandidate {
    private List<Candidate> candidates;

    public ManagerCandidate() {
        this.candidates = new ArrayList<Candidate>();
    }

    public void add(Candidate candidate) {
        this.candidates.add(candidate);
    }

    public void showCandidate() {
        this.candidates.forEach(candidate -> System.out.println(candidate.toString()));
    }

    public boolean searchById(String id) {
        Candidate can = this.candidates.stream().
                filter(candidate1 -> candidate1.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (can == null) {
            return false;
        } else {
            System.out.println(can.toString());
            return true;
        }
    }
}

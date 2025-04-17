abstract class Candidate {
    protected String candidateID;
    protected String name;
    protected String party;

    public Candidate(String candidateID, String name, String party) {
        this.candidateID = candidateID;
        this.name = name;
        this.party = party;
    }

    // Concrete method
    public void showBasicInfo() {
        System.out.println("Candidate ID: " + candidateID);
        System.out.println("Name: " + name);
    }

    // Abstract method
    public abstract void displayInfo();
}
class LocalCandidate extends Candidate {
    private String constituency;

    public LocalCandidate(String candidateID, String name, String party, String constituency) {
        super(candidateID, name, party);
        this.constituency = constituency;
    }

    @Override
    public void displayInfo() {
        System.out.println("----- Local Candidate -----");
        showBasicInfo();
        System.out.println("Party: " + party);
        System.out.println("Constituency: " + constituency);
    }
}

class NationalCandidate extends Candidate {
    private String region;

    public NationalCandidate(String candidateID, String name, String party, String region) {
        super(candidateID, name, party);
        this.region = region;
    }

    @Override
    public void displayInfo() {
        System.out.println("----- National Candidate -----");
        showBasicInfo();
        System.out.println("Party: " + party);
        System.out.println("Region: " + region);
    }
}
public class ElectionApp {
    public static void main(String[] args) {
        // Polymorphism
        Candidate c1 = new LocalCandidate("L0356E1", "Optimus Prime", "Autobots", "Cybertron");
        Candidate c2 = new NationalCandidate("N0078D1", "Megatron", "Decepticons Association", "Decryptron");

        c1.showBasicInfo();
        c2.showBasicInfo();

        System.out.println("\n-- Polymorphic Display Info --");
        c1.displayInfo(); // Calls LocalCandidate’s version
        c2.displayInfo(); // Calls NationalCandidate’s version
    }
}


abstract public class Paper {
    //member field;
    private String description;
    private String id;

    //constructor
    public Paper(String description, String id) {
        this.description = description;
        this.id = id;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //getters
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    //override method toString to get the information of the paper as a string
    @Override
    public String toString() {
        return "ID: " + id + "\n" + "Description: " + description + "\n";
    }

    //override method equals to compare two papers
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Paper) {
            Paper paper = (Paper) obj;
            if (paper.getId().equals(id))
                return true;
            return false;
        }
        return false;
    }
}
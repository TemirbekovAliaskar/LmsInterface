import java.time.LocalDate;
import java.util.Locale;

public abstract class EducationCenter {

    private String name;
    private String localCoutry;
    private LocalDate foundationYear;

    public EducationCenter(String name, String localCoutry, LocalDate foundationYear) {
        this.name = name;
        this.localCoutry = localCoutry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalCoutry() {
        return localCoutry;
    }

    public void setLocalCoutry(String localCoutry) {
        this.localCoutry = localCoutry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", localCoutry='" + localCoutry + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}

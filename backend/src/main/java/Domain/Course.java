package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {

    // title plus year plus term uniquely identfies a course
    private final String title;
    private final int year;
    private final Term term;
    private String description;
    private final List<Module> modules = new ArrayList<>();

    public Course(String title, int year, Term term, String description) {
        this.title = title;
        this.year = year;
        this.term = term;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Term getTerm() {
        return term;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Module> getModules() {
        return modules;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Course course)) return false;
        return year == course.year && Objects.equals(title, course.title) && term == course.term;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, term);
    }
}

package Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Module {

    private String title;
    private final Set<Module> dependsOn = new HashSet<>();
    private final List<PageContent> contents = new ArrayList<>();

    public Module(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //@JsonIgnore //TODO: think about JSON serialization and possible cycles
    public Set<Module> getDependsOn() {
        return dependsOn;
    }

    public List<PageContent> getContents() {
        return contents;
    }

    public void addContent(PageContent page) {
        this.contents.add(page);
    }
}
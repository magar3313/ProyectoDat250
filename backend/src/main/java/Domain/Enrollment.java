package Domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Enrollment {

    private final User user;
    private final Course course;
    private final Role role;
    private final LocalDateTime enrolledAt;

    public Enrollment(User user, Course course, Role role, LocalDateTime enrolledAt) {
        this.user = user;
        this.course = course;
        this.role = role;
        this.enrolledAt = enrolledAt;
    }

    public User getUser() {
        return user;
    }

    public Course getCourse() {
        return course;
    }

    public Role getRole() {
        return role;
    }

    public LocalDateTime getEnrolledAt() {
        return enrolledAt;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Enrollment that)) return false;
        return Objects.equals(user, that.user) && Objects.equals(course, that.course) && role == that.role && Objects.equals(enrolledAt, that.enrolledAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, course, role, enrolledAt);
    }
}


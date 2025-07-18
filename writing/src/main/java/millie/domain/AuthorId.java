package millie.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AuthorId implements Serializable {

    private String id;
    private boolean isApprove;

    protected AuthorId() {
        this.id = null;
        this.isApprove = true;  
    }

    public AuthorId(String id) {
        this.id = id;
        this.isApprove = true;  
    }

    public AuthorId(String id, boolean isApprove) {
        this.id = id;
        this.isApprove = isApprove;  
    }

    public String getId() {
        return id;
    }

    public boolean isApprove() {
        return isApprove;
    }

    public void setApprove(boolean isApprove) {
        this.isApprove = isApprove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthorId)) return false;
        AuthorId authorId = (AuthorId) o;
        return isApprove == authorId.isApprove && Objects.equals(id, authorId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isApprove);
    }
}

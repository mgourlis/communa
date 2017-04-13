package gr.nsyriza.computerization.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "groupName", nullable = false)
    private String groupName;

    @Enumerated(EnumType.STRING)
    private Types.GroupAccess access;

    @Enumerated(EnumType.STRING)
    private Types.GroupType type;

    @ManyToOne
    @JoinColumn(columnDefinition="integer", name="upper_group_id")
    private Group upperGroup;

    @OneToMany(mappedBy = "upperGroup")
    private List<Group> lowerGroups = new ArrayList<Group>();

    @ManyToMany(fetch=FetchType.LAZY, mappedBy="memberGroups")
    private List<Member> groupMembers = new ArrayList<Member>();

    public Integer getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Types.GroupAccess getAccess() {
        return access;
    }

    public void setAccess(Types.GroupAccess access) {
        this.access = access;
    }

    public Types.GroupType getType() {
        return type;
    }

    public void setType(Types.GroupType type) {
        this.type = type;
    }

    public Group getUpperGroup() {
        return upperGroup;
    }

    public void setUpperGroup(Group upperGroup) {
        this.upperGroup = upperGroup;
    }

    public List<Group> getLowerGroups() {
        return lowerGroups;
    }

    public void setLowerGroups(List<Group> lowerGroups) {
        this.lowerGroups = lowerGroups;
    }

    public List<Member> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<Member> groupMembers) {
        this.groupMembers = groupMembers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (id != null ? !id.equals(group.id) : group.id != null) return false;
        return groupName.equals(group.groupName);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + groupName.hashCode();
        return result;
    }
}

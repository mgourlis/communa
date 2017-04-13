package gr.nsyriza.computerization.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by myrgo on 12/4/2017.
 */
@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToMany
    @JoinTable(
            name="members_groups",
            joinColumns=@JoinColumn(name="member_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="group_id", referencedColumnName="id"))
    private List<Group> memberGroups = new ArrayList<Group>();


}

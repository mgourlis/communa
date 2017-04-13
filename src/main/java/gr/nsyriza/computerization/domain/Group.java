package gr.nsyriza.computerization.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by myrgo on 12/4/2017.
 */
@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "groupName")
    private String groupName;

    @ManyToMany(mappedBy="memberGroups")
    private List<Member> groupMembers = new ArrayList<Member>();
}

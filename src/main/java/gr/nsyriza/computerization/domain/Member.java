package gr.nsyriza.computerization.domain;

import javax.persistence.*;

/**
 * Created by myrgo on 12/4/2017.
 */
@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


}

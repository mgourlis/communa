package gr.nsyriza.computerization.domain;

/**
 * Created by myrgo on 13/4/2017.
 */
public class Types {

    public enum GroupAccess {
        open,
        hierarcy,
        closed
    }

    public enum GroupType {
        org_level_1,
        org_level_2,
        org_level_3,
        theme,
        other
    }
}

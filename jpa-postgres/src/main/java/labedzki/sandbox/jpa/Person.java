package labedzki.sandbox.jpa;

import lombok.ToString;

import javax.persistence.*;

/**
 * @author Maciej Łabędzki
 * @since 02.04.19
 */
@Entity
@Table(name = "person")
@ToString
public class Person {

    @Id
    @Column(name = "person_id", unique = true)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "city", nullable = true)
    private String city;

    @OneToOne
    @JoinColumn(name = "city", referencedColumnName = "cityname", insertable = false, updatable = false)
    private Address address;



}

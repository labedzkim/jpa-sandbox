package labedzki.sandbox.jpa;

import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Maciej Łabędzki
 * @since 02.04.19
 */
@Entity
@Table(name = "address")
@ToString
public class Address implements Serializable {



    @Id
    @Column(name = "address_id")
    private long id;

    @Column(unique = false, nullable = false)
    private String countryname;

    @Column(unique = true, nullable = false)
    private String cityname;

    @Column(unique = false, nullable = false)
    private String streetname;
}

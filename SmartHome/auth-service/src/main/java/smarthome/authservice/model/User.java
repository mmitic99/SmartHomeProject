package smarthome.authservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @SequenceGenerator(name = "seqGen", sequenceName = "seq1", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
    private Long id;

    @Column(unique = true, nullable = false)
    public String username;

    @Column(unique = true, nullable = false)
    public String email;

    @Column(unique = true, nullable = false)
    public String password;
}

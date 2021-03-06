package am.trade.tradeappcommon.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "in_came")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class InCame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private User user;
    @Column
    private Date date;
    @ManyToOne
    private People people;
}

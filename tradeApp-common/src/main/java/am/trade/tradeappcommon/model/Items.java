package am.trade.tradeappcommon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private double count;
    @Column(name = "min_count")
    private double minCount;
    @ManyToOne
    private Category category;
    @Column(name = "price_in")
    private double priceIn;
    @Column(name = "price_out")
    private double priceOut;

}
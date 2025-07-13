package reciter.model.identity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ved4006
 * This contains different gender probability list attributed from different sources
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gender {

    private String uniqueId;

    /**
     * Name of the person, usually first name. <i>e.g. <b>Aban, Paul, Nancy </b></i>
     */
    private String name;

    /**
     * Gender of the person
     */
    private GenderEnum gender;

    /**
     * The probability of the person to be male for female. <i>e.g. <b>"probability": 0.998814604077762</b></i>
     */
    private double probability;
}

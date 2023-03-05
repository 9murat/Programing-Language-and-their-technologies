package proje.OneOne.core.utilities.Results;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.criteria.JpaCriteriaUpdate;

public class SuccesResult extends Result{


    public SuccesResult(boolean success, String message) {
        super(true, message);
    }

    public SuccesResult(boolean success) {
        super(true);
    }

}

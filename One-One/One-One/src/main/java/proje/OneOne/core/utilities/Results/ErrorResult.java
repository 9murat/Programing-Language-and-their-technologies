package proje.OneOne.core.utilities.Results;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ErrorResult extends Result {
    public ErrorResult(boolean success, String message) {
        super(false, message);
    }
    public ErrorResult(boolean success) {
        super(false);
    }
}
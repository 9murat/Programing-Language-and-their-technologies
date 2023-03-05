package proje.OneOne.core.utilities.Results;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
@Getter
@Setter
public class SuccessDataResult<T> extends DataResult{
    public SuccessDataResult( T Data ,String message) {
        super(Data,true, message);
    }
    public SuccessDataResult(T Data){
        super(Data , true);
    }
    public SuccessDataResult(String message){
        super(null,true,message);
    }
    public SuccessDataResult(){
        super(null,true);
    }
    public SuccessDataResult(T Data,boolean success ,String message){
        super(Data,true,message);
    }
}

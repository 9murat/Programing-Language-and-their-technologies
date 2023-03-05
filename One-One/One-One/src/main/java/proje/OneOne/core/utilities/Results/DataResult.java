package proje.OneOne.core.utilities.Results;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
@Getter
@Setter
public class DataResult <T>extends Result{
    private T Data;
       public DataResult(T Data ,boolean success, String message) {
        super(success, message);
       this.Data = Data;


    }    public DataResult(T Data,boolean success){
           super(success);
        this.Data = Data;
    }

    public DataResult(T Data,String message){
           super(message);
           this.Data=Data;
    }


    public T getData(){
           return this.Data=Data;
    }
    public DataResult(boolean success,String message){
        super(message);
    }

}

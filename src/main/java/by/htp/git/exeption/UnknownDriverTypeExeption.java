package by.htp.git.exeption;


public class UnknownDriverTypeExeption extends RuntimeException {
    private static final long serialVersionUID = -2223342345234423234L;

    public UnknownDriverTypeExeption(String msg){
        super(msg);
    }


}

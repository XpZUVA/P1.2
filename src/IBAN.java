import java.math.BigInteger;

public class IBAN {

    private BigInteger ccc;
    private int codigo;

    private String ibanCod;

    public IBAN(BigInteger ccc){
        this.ccc = ccc;
    }

    public void crearIBAN(){
        int aux = ccc.mod(BigInteger.valueOf(97)).intValue();
        codigo = 98 - aux;
        if(codigo < 10){
            ibanCod = "ES0" + codigo + ccc.toString();
        }
    }

    public String getIbanCod(){
        return ibanCod;
    }
}

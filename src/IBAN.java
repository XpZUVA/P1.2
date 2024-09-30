import java.math.BigInteger;

public class IBAN {

    private BigInteger ccc, cccFinal;
    private int codigo;

    private String ibanCod;

    public IBAN(BigInteger ccc, BigInteger cccFinal){
        this.ccc = ccc;
        this.cccFinal = cccFinal;
    }

    public void crearIBAN(){
        int aux = ccc.mod(BigInteger.valueOf(97)).intValue();
        codigo = 98 - aux;
        System.out.println(aux + " " + codigo);
        if(codigo < 10){
            ibanCod = "ES0" + codigo + cccFinal.toString();
        }
        else{
            ibanCod = "ES" + codigo + cccFinal.toString();
        }
    }

    public String getIbanCod(){
        return ibanCod;
    }
}

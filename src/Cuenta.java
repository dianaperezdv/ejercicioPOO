import java.util.Random;
import java.util.HashMap;
public class Cuenta {
        private double saldoDeCuenta;
        private String nombreDelTitular;
        private long numeroDeCuenta;

        public Cuenta(String nombreDelTitular, double saldoDeCuenta){
            this.saldoDeCuenta = saldoDeCuenta;
            this.nombreDelTitular = nombreDelTitular;
            this.numeroDeCuenta = new Random().nextLong();
        }

    public double getSaldoDeCuenta() {
        return this.saldoDeCuenta;
    }
    public HashMap<String, String>  getDatosCuenta() {
        String saldoCuentaMap = String.valueOf(this.saldoDeCuenta);
        String numeroCuentaMap = String.valueOf(this.numeroDeCuenta);
        HashMap<String, String> datosGenerales = new HashMap<>();
        datosGenerales.put("nombreDelTitular",this.nombreDelTitular);
        datosGenerales.put("saldoDeCuenta", saldoCuentaMap);
        datosGenerales.put("numeroDeCuenta", numeroCuentaMap);
        return datosGenerales;
    }
    public void setIngreso(int nuevoIngreso) {
        int ingreso = nuevoIngreso;
        this.saldoDeCuenta = this.saldoDeCuenta + ingreso;
        }
    public void setRetiro (int nuevoRetiro) {
        int retiro = nuevoRetiro;
        this.saldoDeCuenta = this.saldoDeCuenta - retiro;
        }
}

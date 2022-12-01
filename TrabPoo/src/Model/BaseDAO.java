package Model;

import java.sql.Connection;

public class BaseDAO {
    protected Connection obterConexao(){
        return EmpilhadeiraAtolada.obterInstancia().obterConexao();
    }
    
}

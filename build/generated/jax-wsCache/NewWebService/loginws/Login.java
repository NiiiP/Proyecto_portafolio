
package loginws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Login", targetNamespace = "http://LoginWS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Login {


    /**
     * 
     * @param p
     * @param u
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginJefesuperior", targetNamespace = "http://LoginWS/", className = "loginws.LoginJefesuperior")
    @ResponseWrapper(localName = "loginJefesuperiorResponse", targetNamespace = "http://LoginWS/", className = "loginws.LoginJefesuperiorResponse")
    @Action(input = "http://LoginWS/Login/loginJefesuperiorRequest", output = "http://LoginWS/Login/loginJefesuperiorResponse")
    public boolean loginJefesuperior(
        @WebParam(name = "u", targetNamespace = "")
        String u,
        @WebParam(name = "p", targetNamespace = "")
        String p);

    /**
     * 
     * @param p2
     * @param u2
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginJefeinterno", targetNamespace = "http://LoginWS/", className = "loginws.LoginJefeinterno")
    @ResponseWrapper(localName = "loginJefeinternoResponse", targetNamespace = "http://LoginWS/", className = "loginws.LoginJefeinternoResponse")
    @Action(input = "http://LoginWS/Login/loginJefeinternoRequest", output = "http://LoginWS/Login/loginJefeinternoResponse")
    public boolean loginJefeinterno(
        @WebParam(name = "u2", targetNamespace = "")
        String u2,
        @WebParam(name = "p2", targetNamespace = "")
        String p2);

    /**
     * 
     * @param p
     * @param u
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginAlcalde", targetNamespace = "http://LoginWS/", className = "loginws.LoginAlcalde")
    @ResponseWrapper(localName = "loginAlcaldeResponse", targetNamespace = "http://LoginWS/", className = "loginws.LoginAlcaldeResponse")
    @Action(input = "http://LoginWS/Login/loginAlcaldeRequest", output = "http://LoginWS/Login/loginAlcaldeResponse")
    public boolean loginAlcalde(
        @WebParam(name = "u", targetNamespace = "")
        String u,
        @WebParam(name = "p", targetNamespace = "")
        String p);

    /**
     * 
     * @param p
     * @param u
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginFuncionario", targetNamespace = "http://LoginWS/", className = "loginws.LoginFuncionario")
    @ResponseWrapper(localName = "loginFuncionarioResponse", targetNamespace = "http://LoginWS/", className = "loginws.LoginFuncionarioResponse")
    @Action(input = "http://LoginWS/Login/loginFuncionarioRequest", output = "http://LoginWS/Login/loginFuncionarioResponse")
    public boolean loginFuncionario(
        @WebParam(name = "u", targetNamespace = "")
        String u,
        @WebParam(name = "p", targetNamespace = "")
        String p);

    /**
     * 
     * @param p
     * @param u
     * @return
     *     returns loginws.Usuario
     */
    @WebMethod(operationName = "DatosUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DatosUsuario", targetNamespace = "http://LoginWS/", className = "loginws.DatosUsuario")
    @ResponseWrapper(localName = "DatosUsuarioResponse", targetNamespace = "http://LoginWS/", className = "loginws.DatosUsuarioResponse")
    @Action(input = "http://LoginWS/Login/DatosUsuarioRequest", output = "http://LoginWS/Login/DatosUsuarioResponse")
    public Usuario datosUsuario(
        @WebParam(name = "u", targetNamespace = "")
        String u,
        @WebParam(name = "p", targetNamespace = "")
        String p);

    /**
     * 
     * @param p
     * @param u
     * @return
     *     returns loginws.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkLogin", targetNamespace = "http://LoginWS/", className = "loginws.CheckLogin")
    @ResponseWrapper(localName = "checkLoginResponse", targetNamespace = "http://LoginWS/", className = "loginws.CheckLoginResponse")
    @Action(input = "http://LoginWS/Login/checkLoginRequest", output = "http://LoginWS/Login/checkLoginResponse")
    public Usuario checkLogin(
        @WebParam(name = "u", targetNamespace = "")
        String u,
        @WebParam(name = "p", targetNamespace = "")
        String p);

}
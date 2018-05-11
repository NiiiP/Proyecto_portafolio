
package loginws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the loginws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DatosUsuario_QNAME = new QName("http://LoginWS/", "DatosUsuario");
    private final static QName _DatosUsuarioResponse_QNAME = new QName("http://LoginWS/", "DatosUsuarioResponse");
    private final static QName _CheckLogin_QNAME = new QName("http://LoginWS/", "checkLogin");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://LoginWS/", "checkLoginResponse");
    private final static QName _LoginAlcalde_QNAME = new QName("http://LoginWS/", "loginAlcalde");
    private final static QName _LoginAlcaldeResponse_QNAME = new QName("http://LoginWS/", "loginAlcaldeResponse");
    private final static QName _LoginFuncionario_QNAME = new QName("http://LoginWS/", "loginFuncionario");
    private final static QName _LoginFuncionarioResponse_QNAME = new QName("http://LoginWS/", "loginFuncionarioResponse");
    private final static QName _LoginJefeinterno_QNAME = new QName("http://LoginWS/", "loginJefeinterno");
    private final static QName _LoginJefeinternoResponse_QNAME = new QName("http://LoginWS/", "loginJefeinternoResponse");
    private final static QName _LoginJefesuperior_QNAME = new QName("http://LoginWS/", "loginJefesuperior");
    private final static QName _LoginJefesuperiorResponse_QNAME = new QName("http://LoginWS/", "loginJefesuperiorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatosUsuario }
     * 
     */
    public DatosUsuario createDatosUsuario() {
        return new DatosUsuario();
    }

    /**
     * Create an instance of {@link DatosUsuarioResponse }
     * 
     */
    public DatosUsuarioResponse createDatosUsuarioResponse() {
        return new DatosUsuarioResponse();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link LoginAlcalde }
     * 
     */
    public LoginAlcalde createLoginAlcalde() {
        return new LoginAlcalde();
    }

    /**
     * Create an instance of {@link LoginAlcaldeResponse }
     * 
     */
    public LoginAlcaldeResponse createLoginAlcaldeResponse() {
        return new LoginAlcaldeResponse();
    }

    /**
     * Create an instance of {@link LoginFuncionario }
     * 
     */
    public LoginFuncionario createLoginFuncionario() {
        return new LoginFuncionario();
    }

    /**
     * Create an instance of {@link LoginFuncionarioResponse }
     * 
     */
    public LoginFuncionarioResponse createLoginFuncionarioResponse() {
        return new LoginFuncionarioResponse();
    }

    /**
     * Create an instance of {@link LoginJefeinterno }
     * 
     */
    public LoginJefeinterno createLoginJefeinterno() {
        return new LoginJefeinterno();
    }

    /**
     * Create an instance of {@link LoginJefeinternoResponse }
     * 
     */
    public LoginJefeinternoResponse createLoginJefeinternoResponse() {
        return new LoginJefeinternoResponse();
    }

    /**
     * Create an instance of {@link LoginJefesuperior }
     * 
     */
    public LoginJefesuperior createLoginJefesuperior() {
        return new LoginJefesuperior();
    }

    /**
     * Create an instance of {@link LoginJefesuperiorResponse }
     * 
     */
    public LoginJefesuperiorResponse createLoginJefesuperiorResponse() {
        return new LoginJefesuperiorResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "DatosUsuario")
    public JAXBElement<DatosUsuario> createDatosUsuario(DatosUsuario value) {
        return new JAXBElement<DatosUsuario>(_DatosUsuario_QNAME, DatosUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "DatosUsuarioResponse")
    public JAXBElement<DatosUsuarioResponse> createDatosUsuarioResponse(DatosUsuarioResponse value) {
        return new JAXBElement<DatosUsuarioResponse>(_DatosUsuarioResponse_QNAME, DatosUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "checkLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "checkLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAlcalde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "loginAlcalde")
    public JAXBElement<LoginAlcalde> createLoginAlcalde(LoginAlcalde value) {
        return new JAXBElement<LoginAlcalde>(_LoginAlcalde_QNAME, LoginAlcalde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAlcaldeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "loginAlcaldeResponse")
    public JAXBElement<LoginAlcaldeResponse> createLoginAlcaldeResponse(LoginAlcaldeResponse value) {
        return new JAXBElement<LoginAlcaldeResponse>(_LoginAlcaldeResponse_QNAME, LoginAlcaldeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFuncionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "loginFuncionario")
    public JAXBElement<LoginFuncionario> createLoginFuncionario(LoginFuncionario value) {
        return new JAXBElement<LoginFuncionario>(_LoginFuncionario_QNAME, LoginFuncionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFuncionarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "loginFuncionarioResponse")
    public JAXBElement<LoginFuncionarioResponse> createLoginFuncionarioResponse(LoginFuncionarioResponse value) {
        return new JAXBElement<LoginFuncionarioResponse>(_LoginFuncionarioResponse_QNAME, LoginFuncionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginJefeinterno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "loginJefeinterno")
    public JAXBElement<LoginJefeinterno> createLoginJefeinterno(LoginJefeinterno value) {
        return new JAXBElement<LoginJefeinterno>(_LoginJefeinterno_QNAME, LoginJefeinterno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginJefeinternoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "loginJefeinternoResponse")
    public JAXBElement<LoginJefeinternoResponse> createLoginJefeinternoResponse(LoginJefeinternoResponse value) {
        return new JAXBElement<LoginJefeinternoResponse>(_LoginJefeinternoResponse_QNAME, LoginJefeinternoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginJefesuperior }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "loginJefesuperior")
    public JAXBElement<LoginJefesuperior> createLoginJefesuperior(LoginJefesuperior value) {
        return new JAXBElement<LoginJefesuperior>(_LoginJefesuperior_QNAME, LoginJefesuperior.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginJefesuperiorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://LoginWS/", name = "loginJefesuperiorResponse")
    public JAXBElement<LoginJefesuperiorResponse> createLoginJefesuperiorResponse(LoginJefesuperiorResponse value) {
        return new JAXBElement<LoginJefesuperiorResponse>(_LoginJefesuperiorResponse_QNAME, LoginJefesuperiorResponse.class, null, value);
    }

}

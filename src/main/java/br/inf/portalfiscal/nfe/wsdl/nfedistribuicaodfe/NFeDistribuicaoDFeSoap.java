
package br.inf.portalfiscal.nfe.wsdl.nfedistribuicaodfe;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NFeDistribuicaoDFeSoap", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeDistribuicaoDFe")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NFeDistribuicaoDFeSoap {


    /**
     * 
     * @param nfeDadosMsg
     * @return
     *     returns br.inf.portalfiscal.nfe.wsdl.nfedistribuicaodfe.NfeDistDFeInteresseResponse.NfeDistDFeInteresseResult
     */
    @WebMethod(action = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeDistribuicaoDFe/nfeDistDFeInteresse")
    @WebResult(name = "nfeDistDFeInteresseResult", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeDistribuicaoDFe")
    @RequestWrapper(localName = "nfeDistDFeInteresse", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeDistribuicaoDFe", className = "br.inf.portalfiscal.nfe.wsdl.nfedistribuicaodfe.NfeDistDFeInteresse")
    @ResponseWrapper(localName = "nfeDistDFeInteresseResponse", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeDistribuicaoDFe", className = "br.inf.portalfiscal.nfe.wsdl.nfedistribuicaodfe.NfeDistDFeInteresseResponse")
    public br.inf.portalfiscal.nfe.wsdl.nfedistribuicaodfe.NfeDistDFeInteresseResponse.NfeDistDFeInteresseResult nfeDistDFeInteresse(
        @WebParam(name = "nfeDadosMsg", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeDistribuicaoDFe")
        br.inf.portalfiscal.nfe.wsdl.nfedistribuicaodfe.NfeDistDFeInteresse.NfeDadosMsg nfeDadosMsg);

}

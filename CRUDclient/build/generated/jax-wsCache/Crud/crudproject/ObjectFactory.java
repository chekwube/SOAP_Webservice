
package crudproject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the crudproject package. 
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

    private final static QName _UpdateData_QNAME = new QName("http://CRUDproject/", "updateData");
    private final static QName _DeleteData_QNAME = new QName("http://CRUDproject/", "deleteData");
    private final static QName _ReadData_QNAME = new QName("http://CRUDproject/", "readData");
    private final static QName _Exception_QNAME = new QName("http://CRUDproject/", "Exception");
    private final static QName _UpdateDataResponse_QNAME = new QName("http://CRUDproject/", "updateDataResponse");
    private final static QName _InsertDataResponse_QNAME = new QName("http://CRUDproject/", "insertDataResponse");
    private final static QName _DeleteDataResponse_QNAME = new QName("http://CRUDproject/", "deleteDataResponse");
    private final static QName _InsertData_QNAME = new QName("http://CRUDproject/", "insertData");
    private final static QName _ReadDataResponse_QNAME = new QName("http://CRUDproject/", "readDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: crudproject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteData }
     * 
     */
    public DeleteData createDeleteData() {
        return new DeleteData();
    }

    /**
     * Create an instance of {@link ReadData }
     * 
     */
    public ReadData createReadData() {
        return new ReadData();
    }

    /**
     * Create an instance of {@link UpdateData }
     * 
     */
    public UpdateData createUpdateData() {
        return new UpdateData();
    }

    /**
     * Create an instance of {@link DeleteDataResponse }
     * 
     */
    public DeleteDataResponse createDeleteDataResponse() {
        return new DeleteDataResponse();
    }

    /**
     * Create an instance of {@link InsertData }
     * 
     */
    public InsertData createInsertData() {
        return new InsertData();
    }

    /**
     * Create an instance of {@link ReadDataResponse }
     * 
     */
    public ReadDataResponse createReadDataResponse() {
        return new ReadDataResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link UpdateDataResponse }
     * 
     */
    public UpdateDataResponse createUpdateDataResponse() {
        return new UpdateDataResponse();
    }

    /**
     * Create an instance of {@link InsertDataResponse }
     * 
     */
    public InsertDataResponse createInsertDataResponse() {
        return new InsertDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CRUDproject/", name = "updateData")
    public JAXBElement<UpdateData> createUpdateData(UpdateData value) {
        return new JAXBElement<UpdateData>(_UpdateData_QNAME, UpdateData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CRUDproject/", name = "deleteData")
    public JAXBElement<DeleteData> createDeleteData(DeleteData value) {
        return new JAXBElement<DeleteData>(_DeleteData_QNAME, DeleteData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CRUDproject/", name = "readData")
    public JAXBElement<ReadData> createReadData(ReadData value) {
        return new JAXBElement<ReadData>(_ReadData_QNAME, ReadData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CRUDproject/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CRUDproject/", name = "updateDataResponse")
    public JAXBElement<UpdateDataResponse> createUpdateDataResponse(UpdateDataResponse value) {
        return new JAXBElement<UpdateDataResponse>(_UpdateDataResponse_QNAME, UpdateDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CRUDproject/", name = "insertDataResponse")
    public JAXBElement<InsertDataResponse> createInsertDataResponse(InsertDataResponse value) {
        return new JAXBElement<InsertDataResponse>(_InsertDataResponse_QNAME, InsertDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CRUDproject/", name = "deleteDataResponse")
    public JAXBElement<DeleteDataResponse> createDeleteDataResponse(DeleteDataResponse value) {
        return new JAXBElement<DeleteDataResponse>(_DeleteDataResponse_QNAME, DeleteDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CRUDproject/", name = "insertData")
    public JAXBElement<InsertData> createInsertData(InsertData value) {
        return new JAXBElement<InsertData>(_InsertData_QNAME, InsertData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CRUDproject/", name = "readDataResponse")
    public JAXBElement<ReadDataResponse> createReadDataResponse(ReadDataResponse value) {
        return new JAXBElement<ReadDataResponse>(_ReadDataResponse_QNAME, ReadDataResponse.class, null, value);
    }

}

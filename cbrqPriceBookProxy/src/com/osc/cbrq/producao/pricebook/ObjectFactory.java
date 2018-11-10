
package com.osc.cbrq.producao.pricebook;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.osc.cbrq.producao.pricebook package. 
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

    private final static QName _Type_QNAME = new QName("commonj.sdo", "type");
    private final static QName _FindControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findControl");
    private final static QName _ProcessControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "processControl");
    private final static QName _FindCriteria_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findCriteria");
    private final static QName _PriceBookHeaderTranslationResult_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "priceBookHeaderTranslationResult");
    private final static QName _PriceBookItem_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "priceBookItem");
    private final static QName _Types_QNAME = new QName("commonj.sdo", "types");
    private final static QName _Fault_QNAME = new QName("http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", "Fault");
    private final static QName _Datagraph_QNAME = new QName("commonj.sdo", "datagraph");
    private final static QName _DataObject_QNAME = new QName("commonj.sdo", "dataObject");
    private final static QName _PriceBookHeaderTranslation_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "priceBookHeaderTranslation");
    private final static QName _PriceBookHeader_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "priceBookHeader");
    private final static QName _ServiceErrorMessage_QNAME = new QName("http://xmlns.oracle.com/adf/svc/errors/", "ServiceErrorMessage");
    private final static QName _PriceBookHeaderTranslationName_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "Name");
    private final static QName _PriceBookHeaderTranslationDescription_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "Description");
    private final static QName _PriceBookHeaderVigenciaFinalC_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "VigenciaFinal_c");
    private final static QName _PriceBookHeaderTabelaRegiaoPromocionalC_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "TabelaRegiaoPromocional_c");
    private final static QName _PriceBookHeaderVigenciaInicialC_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "VigenciaInicial_c");
    private final static QName _PriceBookHeaderUnidadeDeNegocioC_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "UnidadeDeNegocio_c");
    private final static QName _PriceBookItemVolumeC_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "Volume_c");
    private final static QName _PriceBookItemDescontoC_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "Desconto_c");
    private final static QName _PriceBookItemPrecoNegociado2C_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "PrecoNegociado2_c");
    private final static QName _PriceBookItemItemDescription_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "ItemDescription");
    private final static QName _PriceBookItemListPrice_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "ListPrice");
    private final static QName _PriceBookItemPriceUOMCode_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "PriceUOMCode");
    private final static QName _PriceBookItemPrecoNegociadoC_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "PrecoNegociado_c");
    private final static QName _PriceBookItemInvItemId_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "InvItemId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.osc.cbrq.producao.pricebook
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceErrorMessage }
     * 
     */
    public ServiceErrorMessage createServiceErrorMessage() {
        return new ServiceErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceMessage }
     * 
     */
    public ServiceMessage createServiceMessage() {
        return new ServiceMessage();
    }

    /**
     * Create an instance of {@link ServiceDMLErrorMessage }
     * 
     */
    public ServiceDMLErrorMessage createServiceDMLErrorMessage() {
        return new ServiceDMLErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceAttrValErrorMessage }
     * 
     */
    public ServiceAttrValErrorMessage createServiceAttrValErrorMessage() {
        return new ServiceAttrValErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceRowValErrorMessage }
     * 
     */
    public ServiceRowValErrorMessage createServiceRowValErrorMessage() {
        return new ServiceRowValErrorMessage();
    }

    /**
     * Create an instance of {@link JavaInfo }
     * 
     */
    public JavaInfo createJavaInfo() {
        return new JavaInfo();
    }

    /**
     * Create an instance of {@link Types }
     * 
     */
    public Types createTypes() {
        return new Types();
    }

    /**
     * Create an instance of {@link DataGraphType }
     * 
     */
    public DataGraphType createDataGraphType() {
        return new DataGraphType();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link ChangeSummaryType }
     * 
     */
    public ChangeSummaryType createChangeSummaryType() {
        return new ChangeSummaryType();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link XSDType }
     * 
     */
    public XSDType createXSDType() {
        return new XSDType();
    }

    /**
     * Create an instance of {@link ModelsType }
     * 
     */
    public ModelsType createModelsType() {
        return new ModelsType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeResponse }
     * 
     */
    public GetServiceLastUpdateTimeResponse createGetServiceLastUpdateTimeResponse() {
        return new GetServiceLastUpdateTimeResponse();
    }

    /**
     * Create an instance of {@link UpdatePriceBookAsyncResponse }
     * 
     */
    public UpdatePriceBookAsyncResponse createUpdatePriceBookAsyncResponse() {
        return new UpdatePriceBookAsyncResponse();
    }

    /**
     * Create an instance of {@link PriceBookHeader }
     * 
     */
    public PriceBookHeader createPriceBookHeader() {
        return new PriceBookHeader();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsAsync }
     * 
     */
    public GetDfltObjAttrHintsAsync createGetDfltObjAttrHintsAsync() {
        return new GetDfltObjAttrHintsAsync();
    }

    /**
     * Create an instance of {@link FindPriceBookByIdResponse }
     * 
     */
    public FindPriceBookByIdResponse createFindPriceBookByIdResponse() {
        return new FindPriceBookByIdResponse();
    }

    /**
     * Create an instance of {@link DeletePriceBookAsync }
     * 
     */
    public DeletePriceBookAsync createDeletePriceBookAsync() {
        return new DeletePriceBookAsync();
    }

    /**
     * Create an instance of {@link GetEntityListAsync }
     * 
     */
    public GetEntityListAsync createGetEntityListAsync() {
        return new GetEntityListAsync();
    }

    /**
     * Create an instance of {@link DeletePriceBook }
     * 
     */
    public DeletePriceBook createDeletePriceBook() {
        return new DeletePriceBook();
    }

    /**
     * Create an instance of {@link FindPriceBookResponse }
     * 
     */
    public FindPriceBookResponse createFindPriceBookResponse() {
        return new FindPriceBookResponse();
    }

    /**
     * Create an instance of {@link MergePriceBookAsync }
     * 
     */
    public MergePriceBookAsync createMergePriceBookAsync() {
        return new MergePriceBookAsync();
    }

    /**
     * Create an instance of {@link DeletePriceBookItem }
     * 
     */
    public DeletePriceBookItem createDeletePriceBookItem() {
        return new DeletePriceBookItem();
    }

    /**
     * Create an instance of {@link PriceBookItem }
     * 
     */
    public PriceBookItem createPriceBookItem() {
        return new PriceBookItem();
    }

    /**
     * Create an instance of {@link FindPriceBookAsyncResponse }
     * 
     */
    public FindPriceBookAsyncResponse createFindPriceBookAsyncResponse() {
        return new FindPriceBookAsyncResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeAsync }
     * 
     */
    public GetServiceLastUpdateTimeAsync createGetServiceLastUpdateTimeAsync() {
        return new GetServiceLastUpdateTimeAsync();
    }

    /**
     * Create an instance of {@link DeletePriceBookItemResponse }
     * 
     */
    public DeletePriceBookItemResponse createDeletePriceBookItemResponse() {
        return new DeletePriceBookItemResponse();
    }

    /**
     * Create an instance of {@link GetEntityList }
     * 
     */
    public GetEntityList createGetEntityList() {
        return new GetEntityList();
    }

    /**
     * Create an instance of {@link UpdatePriceBookResponse }
     * 
     */
    public UpdatePriceBookResponse createUpdatePriceBookResponse() {
        return new UpdatePriceBookResponse();
    }

    /**
     * Create an instance of {@link MergePriceBookAsyncResponse }
     * 
     */
    public MergePriceBookAsyncResponse createMergePriceBookAsyncResponse() {
        return new MergePriceBookAsyncResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTime }
     * 
     */
    public GetServiceLastUpdateTime createGetServiceLastUpdateTime() {
        return new GetServiceLastUpdateTime();
    }

    /**
     * Create an instance of {@link CreatePriceBookAsync }
     * 
     */
    public CreatePriceBookAsync createCreatePriceBookAsync() {
        return new CreatePriceBookAsync();
    }

    /**
     * Create an instance of {@link MergePriceBook }
     * 
     */
    public MergePriceBook createMergePriceBook() {
        return new MergePriceBook();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsResponse }
     * 
     */
    public GetDfltObjAttrHintsResponse createGetDfltObjAttrHintsResponse() {
        return new GetDfltObjAttrHintsResponse();
    }

    /**
     * Create an instance of {@link ObjAttrHints }
     * 
     */
    public ObjAttrHints createObjAttrHints() {
        return new ObjAttrHints();
    }

    /**
     * Create an instance of {@link UpdatePriceBook }
     * 
     */
    public UpdatePriceBook createUpdatePriceBook() {
        return new UpdatePriceBook();
    }

    /**
     * Create an instance of {@link CreatePriceBook }
     * 
     */
    public CreatePriceBook createCreatePriceBook() {
        return new CreatePriceBook();
    }

    /**
     * Create an instance of {@link CreatePriceBookAsyncResponse }
     * 
     */
    public CreatePriceBookAsyncResponse createCreatePriceBookAsyncResponse() {
        return new CreatePriceBookAsyncResponse();
    }

    /**
     * Create an instance of {@link UpdatePriceBookAsync }
     * 
     */
    public UpdatePriceBookAsync createUpdatePriceBookAsync() {
        return new UpdatePriceBookAsync();
    }

    /**
     * Create an instance of {@link DeletePriceBookItemAsyncResponse }
     * 
     */
    public DeletePriceBookItemAsyncResponse createDeletePriceBookItemAsyncResponse() {
        return new DeletePriceBookItemAsyncResponse();
    }

    /**
     * Create an instance of {@link FindPriceBook }
     * 
     */
    public FindPriceBook createFindPriceBook() {
        return new FindPriceBook();
    }

    /**
     * Create an instance of {@link FindCriteria }
     * 
     */
    public FindCriteria createFindCriteria() {
        return new FindCriteria();
    }

    /**
     * Create an instance of {@link FindControl }
     * 
     */
    public FindControl createFindControl() {
        return new FindControl();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHints }
     * 
     */
    public GetDfltObjAttrHints createGetDfltObjAttrHints() {
        return new GetDfltObjAttrHints();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsAsyncResponse }
     * 
     */
    public GetDfltObjAttrHintsAsyncResponse createGetDfltObjAttrHintsAsyncResponse() {
        return new GetDfltObjAttrHintsAsyncResponse();
    }

    /**
     * Create an instance of {@link FindPriceBookByIdAsyncResponse }
     * 
     */
    public FindPriceBookByIdAsyncResponse createFindPriceBookByIdAsyncResponse() {
        return new FindPriceBookByIdAsyncResponse();
    }

    /**
     * Create an instance of {@link FindPriceBookByIdAsync }
     * 
     */
    public FindPriceBookByIdAsync createFindPriceBookByIdAsync() {
        return new FindPriceBookByIdAsync();
    }

    /**
     * Create an instance of {@link GetEntityListResponse }
     * 
     */
    public GetEntityListResponse createGetEntityListResponse() {
        return new GetEntityListResponse();
    }

    /**
     * Create an instance of {@link ServiceViewInfo }
     * 
     */
    public ServiceViewInfo createServiceViewInfo() {
        return new ServiceViewInfo();
    }

    /**
     * Create an instance of {@link MergePriceBookResponse }
     * 
     */
    public MergePriceBookResponse createMergePriceBookResponse() {
        return new MergePriceBookResponse();
    }

    /**
     * Create an instance of {@link DeletePriceBookAsyncResponse }
     * 
     */
    public DeletePriceBookAsyncResponse createDeletePriceBookAsyncResponse() {
        return new DeletePriceBookAsyncResponse();
    }

    /**
     * Create an instance of {@link GetEntityListAsyncResponse }
     * 
     */
    public GetEntityListAsyncResponse createGetEntityListAsyncResponse() {
        return new GetEntityListAsyncResponse();
    }

    /**
     * Create an instance of {@link CreatePriceBookResponse }
     * 
     */
    public CreatePriceBookResponse createCreatePriceBookResponse() {
        return new CreatePriceBookResponse();
    }

    /**
     * Create an instance of {@link FindPriceBookById }
     * 
     */
    public FindPriceBookById createFindPriceBookById() {
        return new FindPriceBookById();
    }

    /**
     * Create an instance of {@link DeletePriceBookResponse }
     * 
     */
    public DeletePriceBookResponse createDeletePriceBookResponse() {
        return new DeletePriceBookResponse();
    }

    /**
     * Create an instance of {@link FindPriceBookAsync }
     * 
     */
    public FindPriceBookAsync createFindPriceBookAsync() {
        return new FindPriceBookAsync();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeAsyncResponse }
     * 
     */
    public GetServiceLastUpdateTimeAsyncResponse createGetServiceLastUpdateTimeAsyncResponse() {
        return new GetServiceLastUpdateTimeAsyncResponse();
    }

    /**
     * Create an instance of {@link DeletePriceBookItemAsync }
     * 
     */
    public DeletePriceBookItemAsync createDeletePriceBookItemAsync() {
        return new DeletePriceBookItemAsync();
    }

    /**
     * Create an instance of {@link ProcessControl }
     * 
     */
    public ProcessControl createProcessControl() {
        return new ProcessControl();
    }

    /**
     * Create an instance of {@link ChildFindCriteria }
     * 
     */
    public ChildFindCriteria createChildFindCriteria() {
        return new ChildFindCriteria();
    }

    /**
     * Create an instance of {@link BigIntegerResult }
     * 
     */
    public BigIntegerResult createBigIntegerResult() {
        return new BigIntegerResult();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link DateResult }
     * 
     */
    public DateResult createDateResult() {
        return new DateResult();
    }

    /**
     * Create an instance of {@link DoubleResult }
     * 
     */
    public DoubleResult createDoubleResult() {
        return new DoubleResult();
    }

    /**
     * Create an instance of {@link DataObjectResult }
     * 
     */
    public DataObjectResult createDataObjectResult() {
        return new DataObjectResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaItem }
     * 
     */
    public ViewCriteriaItem createViewCriteriaItem() {
        return new ViewCriteriaItem();
    }

    /**
     * Create an instance of {@link AttrCtrlHints }
     * 
     */
    public AttrCtrlHints createAttrCtrlHints() {
        return new AttrCtrlHints();
    }

    /**
     * Create an instance of {@link LongResult }
     * 
     */
    public LongResult createLongResult() {
        return new LongResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaRow }
     * 
     */
    public ViewCriteriaRow createViewCriteriaRow() {
        return new ViewCriteriaRow();
    }

    /**
     * Create an instance of {@link BigDecimalResult }
     * 
     */
    public BigDecimalResult createBigDecimalResult() {
        return new BigDecimalResult();
    }

    /**
     * Create an instance of {@link BooleanResult }
     * 
     */
    public BooleanResult createBooleanResult() {
        return new BooleanResult();
    }

    /**
     * Create an instance of {@link SortAttribute }
     * 
     */
    public SortAttribute createSortAttribute() {
        return new SortAttribute();
    }

    /**
     * Create an instance of {@link TimestampResult }
     * 
     */
    public TimestampResult createTimestampResult() {
        return new TimestampResult();
    }

    /**
     * Create an instance of {@link SortOrder }
     * 
     */
    public SortOrder createSortOrder() {
        return new SortOrder();
    }

    /**
     * Create an instance of {@link ShortResult }
     * 
     */
    public ShortResult createShortResult() {
        return new ShortResult();
    }

    /**
     * Create an instance of {@link BytesResult }
     * 
     */
    public BytesResult createBytesResult() {
        return new BytesResult();
    }

    /**
     * Create an instance of {@link CtrlHint }
     * 
     */
    public CtrlHint createCtrlHint() {
        return new CtrlHint();
    }

    /**
     * Create an instance of {@link FloatResult }
     * 
     */
    public FloatResult createFloatResult() {
        return new FloatResult();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link TimeResult }
     * 
     */
    public TimeResult createTimeResult() {
        return new TimeResult();
    }

    /**
     * Create an instance of {@link StringResult }
     * 
     */
    public StringResult createStringResult() {
        return new StringResult();
    }

    /**
     * Create an instance of {@link DataHandlerResult }
     * 
     */
    public DataHandlerResult createDataHandlerResult() {
        return new DataHandlerResult();
    }

    /**
     * Create an instance of {@link ViewCriteria }
     * 
     */
    public ViewCriteria createViewCriteria() {
        return new ViewCriteria();
    }

    /**
     * Create an instance of {@link ByteResult }
     * 
     */
    public ByteResult createByteResult() {
        return new ByteResult();
    }

    /**
     * Create an instance of {@link MethodResult }
     * 
     */
    public MethodResult createMethodResult() {
        return new MethodResult();
    }

    /**
     * Create an instance of {@link IntegerResult }
     * 
     */
    public IntegerResult createIntegerResult() {
        return new IntegerResult();
    }

    /**
     * Create an instance of {@link XMLInfo }
     * 
     */
    public XMLInfo createXMLInfo() {
        return new XMLInfo();
    }

    /**
     * Create an instance of {@link PriceBookHeaderTranslation }
     * 
     */
    public PriceBookHeaderTranslation createPriceBookHeaderTranslation() {
        return new PriceBookHeaderTranslation();
    }

    /**
     * Create an instance of {@link PriceBookHeaderTranslationResult }
     * 
     */
    public PriceBookHeaderTranslationResult createPriceBookHeaderTranslationResult() {
        return new PriceBookHeaderTranslationResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findControl")
    public JAXBElement<FindControl> createFindControl(FindControl value) {
        return new JAXBElement<FindControl>(_FindControl_QNAME, FindControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "processControl")
    public JAXBElement<ProcessControl> createProcessControl(ProcessControl value) {
        return new JAXBElement<ProcessControl>(_ProcessControl_QNAME, ProcessControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findCriteria")
    public JAXBElement<FindCriteria> createFindCriteria(FindCriteria value) {
        return new JAXBElement<FindCriteria>(_FindCriteria_QNAME, FindCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceBookHeaderTranslationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "priceBookHeaderTranslationResult")
    public JAXBElement<PriceBookHeaderTranslationResult> createPriceBookHeaderTranslationResult(PriceBookHeaderTranslationResult value) {
        return new JAXBElement<PriceBookHeaderTranslationResult>(_PriceBookHeaderTranslationResult_QNAME, PriceBookHeaderTranslationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceBookItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "priceBookItem")
    public JAXBElement<PriceBookItem> createPriceBookItem(PriceBookItem value) {
        return new JAXBElement<PriceBookItem>(_PriceBookItem_QNAME, PriceBookItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Types }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "types")
    public JAXBElement<Types> createTypes(Types value) {
        return new JAXBElement<Types>(_Types_QNAME, Types.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", name = "Fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataGraphType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "datagraph")
    public JAXBElement<DataGraphType> createDatagraph(DataGraphType value) {
        return new JAXBElement<DataGraphType>(_Datagraph_QNAME, DataGraphType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "dataObject")
    public JAXBElement<Object> createDataObject(Object value) {
        return new JAXBElement<Object>(_DataObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceBookHeaderTranslation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "priceBookHeaderTranslation")
    public JAXBElement<PriceBookHeaderTranslation> createPriceBookHeaderTranslation(PriceBookHeaderTranslation value) {
        return new JAXBElement<PriceBookHeaderTranslation>(_PriceBookHeaderTranslation_QNAME, PriceBookHeaderTranslation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceBookHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "priceBookHeader")
    public JAXBElement<PriceBookHeader> createPriceBookHeader(PriceBookHeader value) {
        return new JAXBElement<PriceBookHeader>(_PriceBookHeader_QNAME, PriceBookHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/errors/", name = "ServiceErrorMessage")
    public JAXBElement<ServiceErrorMessage> createServiceErrorMessage(ServiceErrorMessage value) {
        return new JAXBElement<ServiceErrorMessage>(_ServiceErrorMessage_QNAME, ServiceErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "Name", scope = PriceBookHeaderTranslation.class)
    public JAXBElement<String> createPriceBookHeaderTranslationName(String value) {
        return new JAXBElement<String>(_PriceBookHeaderTranslationName_QNAME, String.class, PriceBookHeaderTranslation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "Description", scope = PriceBookHeaderTranslation.class)
    public JAXBElement<String> createPriceBookHeaderTranslationDescription(String value) {
        return new JAXBElement<String>(_PriceBookHeaderTranslationDescription_QNAME, String.class, PriceBookHeaderTranslation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "VigenciaFinal_c", scope = PriceBookHeader.class)
    public JAXBElement<XMLGregorianCalendar> createPriceBookHeaderVigenciaFinalC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PriceBookHeaderVigenciaFinalC_QNAME, XMLGregorianCalendar.class, PriceBookHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "TabelaRegiaoPromocional_c", scope = PriceBookHeader.class)
    public JAXBElement<String> createPriceBookHeaderTabelaRegiaoPromocionalC(String value) {
        return new JAXBElement<String>(_PriceBookHeaderTabelaRegiaoPromocionalC_QNAME, String.class, PriceBookHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "VigenciaInicial_c", scope = PriceBookHeader.class)
    public JAXBElement<XMLGregorianCalendar> createPriceBookHeaderVigenciaInicialC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PriceBookHeaderVigenciaInicialC_QNAME, XMLGregorianCalendar.class, PriceBookHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "Description", scope = PriceBookHeader.class)
    public JAXBElement<String> createPriceBookHeaderDescription(String value) {
        return new JAXBElement<String>(_PriceBookHeaderTranslationDescription_QNAME, String.class, PriceBookHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "UnidadeDeNegocio_c", scope = PriceBookHeader.class)
    public JAXBElement<String> createPriceBookHeaderUnidadeDeNegocioC(String value) {
        return new JAXBElement<String>(_PriceBookHeaderUnidadeDeNegocioC_QNAME, String.class, PriceBookHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "Volume_c", scope = PriceBookItem.class)
    public JAXBElement<BigDecimal> createPriceBookItemVolumeC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceBookItemVolumeC_QNAME, BigDecimal.class, PriceBookItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "Desconto_c", scope = PriceBookItem.class)
    public JAXBElement<BigDecimal> createPriceBookItemDescontoC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceBookItemDescontoC_QNAME, BigDecimal.class, PriceBookItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "PrecoNegociado2_c", scope = PriceBookItem.class)
    public JAXBElement<BigDecimal> createPriceBookItemPrecoNegociado2C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceBookItemPrecoNegociado2C_QNAME, BigDecimal.class, PriceBookItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "ItemDescription", scope = PriceBookItem.class)
    public JAXBElement<String> createPriceBookItemItemDescription(String value) {
        return new JAXBElement<String>(_PriceBookItemItemDescription_QNAME, String.class, PriceBookItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "ListPrice", scope = PriceBookItem.class)
    public JAXBElement<AmountType> createPriceBookItemListPrice(AmountType value) {
        return new JAXBElement<AmountType>(_PriceBookItemListPrice_QNAME, AmountType.class, PriceBookItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "PriceUOMCode", scope = PriceBookItem.class)
    public JAXBElement<String> createPriceBookItemPriceUOMCode(String value) {
        return new JAXBElement<String>(_PriceBookItemPriceUOMCode_QNAME, String.class, PriceBookItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "PrecoNegociado_c", scope = PriceBookItem.class)
    public JAXBElement<BigDecimal> createPriceBookItemPrecoNegociadoC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceBookItemPrecoNegociadoC_QNAME, BigDecimal.class, PriceBookItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", name = "InvItemId", scope = PriceBookItem.class)
    public JAXBElement<Long> createPriceBookItemInvItemId(Long value) {
        return new JAXBElement<Long>(_PriceBookItemInvItemId_QNAME, Long.class, PriceBookItem.class, value);
    }

}

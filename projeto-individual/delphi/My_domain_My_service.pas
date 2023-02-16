unit My_domain_My_service;

(**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 *)

{$TYPEINFO ON}

interface

uses
  Classes, SDLTypes, Controls, RtStrUtil, JsonConverter;

const
  cDomain = 'my_domain';
  cService = 'my_service';

type

  TCommands = class
  public
    (**
     * @see THelloWorldInput the request payload
     *)
    class function GetHello_World: String;
    (**
     * The response primitive for helloWorld.
     *
     * @see cHello_World the request primitive
     * @see THelloWorldOutput the response payload
     *)
    class function GetHello_World_Response: String;
    (**
     * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
     * @see TGetMetadataInput the request payload
     *)
    class function GetGet_Metadata: String;
    (**
     * The response primitive for getMetadata.
     *
     * @see cGet_Metadata the request primitive
     * @see TGetMetadataOutput the response payload
     *)
    class function GetGet_Metadata_Response: String;
    (**
     * Returns a list with all dependencies from this service, along with their respective versions
     *)
    class function GetGet_Dependencies: String;
    (**
     * The response primitive for getDependencies.
     *
     * @see cGet_Dependencies the request primitive
     * @see TGetDependenciesOutput the response payload
     *)
    class function GetGet_Dependencies_Response: String;
  end;

  TEvents = class
  public
    (**
     * Default 'serviceStarted' event.
     *)
    class function GetService_Started: String;
    (**
     * Default 'notifyUser' event.
     *)
    class function GetNotify_User_Event: String;
  end;

  (**
   * User notification kind.
   *)
  TUserNotificationKind = (unkOperational, unkManagement, unkNews);
  (**
   * User notification priority.
   *)
  TUserNotificationPriority = (unpError, unpAlert, unpNone);
  (**
   * Format of the email
   *)
  TEventEmailFormat = (eefHTML, eefPLAIN_TEXT);
  
const
  cUserNotificationKindNames: array [TUserNotificationKind] of String = ('Operational', 'Management', 'News');
  cUserNotificationPriorityNames: array [TUserNotificationPriority] of String = ('Error', 'Alert', 'None');
  cEventEmailFormatNames: array [TEventEmailFormat] of String = ('HTML', 'PLAIN_TEXT');

type
  TNotifyUserEventPayload = class;
  TEmailNotifyUserEventPayload = class;
  TPushNotifyUserEventPayload = class;
  TBlobReference = class;
  TBasicErrorPayload = class;
  TDependency = class;
  THelloWorldInput = class;
  THelloWorldOutput = class;
  TGetMetadataInput = class;
  TGetMetadataOutput = class;
  TGetDependenciesOutput = class;
  TServiceStartedPayload = class;
  
  (**
   * Represents a regular user event notification payload
   *)
  TNotifyUserEventPayload = class(TNullPrimitivesHandler)
  private
    FNullNotificationClass: Boolean;
    FNullNotificationOrigin: Boolean;
    FNullNotificationKind: Boolean;
    FNullNotificationPriority: Boolean;
    FNullNotificationSubject: Boolean;
    FNullNotificationContent: Boolean;
    FNullSourceDomain: Boolean;
    FNullSourceService: Boolean;
    FNullDestinationUser: Boolean;
    FNullLink: Boolean;
    FNotificationClass: String;
    FNotificationOrigin: String;
    FNotificationKind: TUserNotificationKind;
    FNotificationPriority: TUserNotificationPriority;
    FNotificationSubject: String;
    FNotificationContent: String;
    FSourceDomain: String;
    FSourceService: String;
    FDestinationUser: String;
    FLink: String;
    procedure SetNotificationClass(aValue: String);
    procedure SetNotificationOrigin(aValue: String);
    procedure SetNotificationKind(aValue: TUserNotificationKind);
    procedure SetNotificationPriority(aValue: TUserNotificationPriority);
    procedure SetNotificationSubject(aValue: String);
    procedure SetNotificationContent(aValue: String);
    procedure SetSourceDomain(aValue: String);
    procedure SetSourceService(aValue: String);
    procedure SetDestinationUser(aValue: String);
    procedure SetLink(aValue: String);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    property NotificationClassIsNull: Boolean read FNullNotificationClass write FNullNotificationClass;
    property NotificationOriginIsNull: Boolean read FNullNotificationOrigin write FNullNotificationOrigin;
    property NotificationKindIsNull: Boolean read FNullNotificationKind write FNullNotificationKind;
    property NotificationPriorityIsNull: Boolean read FNullNotificationPriority write FNullNotificationPriority;
    property NotificationSubjectIsNull: Boolean read FNullNotificationSubject write FNullNotificationSubject;
    property NotificationContentIsNull: Boolean read FNullNotificationContent write FNullNotificationContent;
    property SourceDomainIsNull: Boolean read FNullSourceDomain write FNullSourceDomain;
    property SourceServiceIsNull: Boolean read FNullSourceService write FNullSourceService;
    property DestinationUserIsNull: Boolean read FNullDestinationUser write FNullDestinationUser;
    property LinkIsNull: Boolean read FNullLink write FNullLink;
  published
    (**
     * Class of notification
     *)
    property NotificationClass: String read FNotificationClass write SetNotificationClass;
    (**
     * Origin of notification. Free text. Optional.
     *)
    property NotificationOrigin: String read FNotificationOrigin write SetNotificationOrigin;
    (**
     * Notification kind.
     *)
    property NotificationKind: TUserNotificationKind read FNotificationKind write SetNotificationKind;
    (**
     * Notification priority.
     *)
    property NotificationPriority: TUserNotificationPriority read FNotificationPriority write SetNotificationPriority;
    (**
     * Notification subject.
     *)
    property NotificationSubject: String read FNotificationSubject write SetNotificationSubject;
    (**
     * Notification content.
     *)
    property NotificationContent: String read FNotificationContent write SetNotificationContent;
    (**
     * Domain that generates the notification.
     *)
    property SourceDomain: String read FSourceDomain write SetSourceDomain;
    (**
     * Service that generates the notification.
     *)
    property SourceService: String read FSourceService write SetSourceService;
    (**
     * Username of the destination user.
     *)
    property DestinationUser: String read FDestinationUser write SetDestinationUser;
    (**
     * Notification link
     *)
    property Link: String read FLink write SetLink;
  end;
  
  (**
   * Represents an email notification payload
   *)
  TEmailNotifyUserEventPayload = class(TNotifyUserEventPayload)
  private
    FNullFrom: Boolean;
    FNullFormat: Boolean;
    FFrom: String;
    FSendTo: TSDLStringList;
    FFormat: TEventEmailFormat;
    procedure SetFrom(aValue: String);
    procedure SetFormat(aValue: TEventEmailFormat);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    procedure AddSendTo(aItem: String);
    function GetSendTo(aIndex: Integer): String;
    property FromIsNull: Boolean read FNullFrom write FNullFrom;
    property FormatIsNull: Boolean read FNullFormat write FNullFormat;
  published
    (**
     * Email sender address
     *)
    property From: String read FFrom write SetFrom;
    (**
     * Additional recipients to send the email to
     *)
    property SendTo: TSDLStringList read FSendTo;
    (**
     * Email format
     *)
    property Format: TEventEmailFormat read FFormat write SetFormat;
  end;
  
  (**
   * Represents a push notification payload
   *)
  TPushNotifyUserEventPayload = class(TNotifyUserEventPayload)
  private
    FNullApplicationId: Boolean;
    FApplicationId: String;
    procedure SetApplicationId(aValue: String);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    property ApplicationIdIsNull: Boolean read FNullApplicationId write FNullApplicationId;
  published
    (**
     * Apple/Google application id
     *)
    property ApplicationId: String read FApplicationId write SetApplicationId;
  end;
  
  (**
   * Default blob reference type. Every service defines its own.
   *)
  TBlobReference = class(TNullPrimitivesHandler)
  private
    FNullDomainName: Boolean;
    FNullServiceName: Boolean;
    FNullTargetObjectId: Boolean;
    FNullTargetCopyId: Boolean;
    FDomainName: String;
    FServiceName: String;
    FTargetObjectId: String;
    FTargetCopyId: String;
    procedure SetDomainName(aValue: String);
    procedure SetServiceName(aValue: String);
    procedure SetTargetObjectId(aValue: String);
    procedure SetTargetCopyId(aValue: String);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    property DomainNameIsNull: Boolean read FNullDomainName write FNullDomainName;
    property ServiceNameIsNull: Boolean read FNullServiceName write FNullServiceName;
    property TargetObjectIdIsNull: Boolean read FNullTargetObjectId write FNullTargetObjectId;
    property TargetCopyIdIsNull: Boolean read FNullTargetCopyId write FNullTargetCopyId;
  published
    (**
     * The domain the blob belongs to.
     *)
    property DomainName: String read FDomainName write SetDomainName;
    (**
     * The service the blob belongs to.
     *)
    property ServiceName: String read FServiceName write SetServiceName;
    (**
     * The basic id of the blob.
     *)
    property TargetObjectId: String read FTargetObjectId write SetTargetObjectId;
    (**
     * The id of the blob copy.
     *)
    property TargetCopyId: String read FTargetCopyId write SetTargetCopyId;
  end;
  
  (**
   * Default error payload type. Every service defines its own.
   *)
  TBasicErrorPayload = class(TNullPrimitivesHandler)
  private
    FNullMessage: Boolean;
    FNullErrorCode: Boolean;
    FMessage: String;
    FErrorCode: String;
    procedure SetMessage(aValue: String);
    procedure SetErrorCode(aValue: String);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    property MessageIsNull: Boolean read FNullMessage write FNullMessage;
    property ErrorCodeIsNull: Boolean read FNullErrorCode write FNullErrorCode;
  published
    (**
     * The user-facing error message, if any.
     *)
    property Message: String read FMessage write SetMessage;
    (**
     * The program-accessible (and service-specific) error code.
     *)
    property ErrorCode: String read FErrorCode write SetErrorCode;
  end;
  
  (**
   * Represents a service dependency
   *)
  TDependency = class(TNullPrimitivesHandler)
  private
    FNullDomain: Boolean;
    FNullService: Boolean;
    FNullVersion: Boolean;
    FDomain: String;
    FService: String;
    FVersion: String;
    procedure SetDomain(aValue: String);
    procedure SetService(aValue: String);
    procedure SetVersion(aValue: String);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    property DomainIsNull: Boolean read FNullDomain write FNullDomain;
    property ServiceIsNull: Boolean read FNullService write FNullService;
    property VersionIsNull: Boolean read FNullVersion write FNullVersion;
  published
    (**
     * Domain of the dependency service
     *)
    property Domain: String read FDomain write SetDomain;
    (**
     * Name of the dependency service
     *)
    property Service: String read FService write SetService;
    (**
     * Version of the dependency service
     *)
    property Version: String read FVersion write SetVersion;
  end;
  
  THelloWorldInput = class(TNullPrimitivesHandler)
  private
    FNullWho: Boolean;
    FWho: String;
    procedure SetWho(aValue: String);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    property WhoIsNull: Boolean read FNullWho write FNullWho;
  published
    property Who: String read FWho write SetWho;
  end;
  
  THelloWorldOutput = class(TNullPrimitivesHandler)
  private
    FNullHelloWorldMessage: Boolean;
    FHelloWorldMessage: String;
    procedure SetHelloWorldMessage(aValue: String);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    property HelloWorldMessageIsNull: Boolean read FNullHelloWorldMessage write FNullHelloWorldMessage;
  published
    property HelloWorldMessage: String read FHelloWorldMessage write SetHelloWorldMessage;
  end;
  
  TGetMetadataInput = class(TNullPrimitivesHandler)
  private
    FNullMetadataFormat: Boolean;
    FMetadataFormat: String;
    procedure SetMetadataFormat(aValue: String);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    property MetadataFormatIsNull: Boolean read FNullMetadataFormat write FNullMetadataFormat;
  published
    property MetadataFormat: String read FMetadataFormat write SetMetadataFormat;
  end;
  
  TGetMetadataOutput = class(TNullPrimitivesHandler)
  private
    FNullMetadata: Boolean;
    FMetadata: String;
    procedure SetMetadata(aValue: String);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    property MetadataIsNull: Boolean read FNullMetadata write FNullMetadata;
  published
    property Metadata: String read FMetadata write SetMetadata;
  end;
  
  TGetDependenciesOutput = class(TNullPrimitivesHandler)
  private
    FDependencies: TSDLObjectList;
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    procedure AddDependencies(aItem: TDependency);
    function GetDependencies(aIndex: Integer): TDependency;
  published
    (**
     * List with this service dependencies
     *)
    property Dependencies: TSDLObjectList read FDependencies;
  end;
  
  TServiceStartedPayload = class(TNullPrimitivesHandler)
  private
    FNullDomain: Boolean;
    FNullService: Boolean;
    FDomain: String;
    FService: String;
    procedure SetDomain(aValue: String);
    procedure SetService(aValue: String);
  public
    procedure AfterConstruction; override;
    procedure BeforeDestruction; override;
    function GetContext: String; override;
    function IsNullProperty(aPropertyName: String): Boolean; override;
    procedure Validate; overload;
    procedure Validate(aValidated: TList); overload;
    property DomainIsNull: Boolean read FNullDomain write FNullDomain;
    property ServiceIsNull: Boolean read FNullService write FNullService;
  published
    property Domain: String read FDomain write SetDomain;
    property Service: String read FService write SetService;
  end;
  
  (**
   * Validators for payloads accepted/produced by endpoints in my_service.
   *)
  TMyServiceValidator = class
  public
    class procedure Validate(aToValidate: THelloWorldInput); overload;
    class procedure Validate(aToValidate: THelloWorldInput; aValidated: TList); overload;
    class procedure Validate(aToValidate: THelloWorldOutput); overload;
    class procedure Validate(aToValidate: THelloWorldOutput; aValidated: TList); overload;
    class procedure Validate(aToValidate: TServiceStartedPayload); overload;
    class procedure Validate(aToValidate: TServiceStartedPayload; aValidated: TList); overload;
    class procedure Validate(aToValidate: TNotifyUserEventPayload); overload;
    class procedure Validate(aToValidate: TNotifyUserEventPayload; aValidated: TList); overload;
    class procedure Validate(aToValidate: TEmailNotifyUserEventPayload); overload;
    class procedure Validate(aToValidate: TEmailNotifyUserEventPayload; aValidated: TList); overload;
    class procedure Validate(aToValidate: TPushNotifyUserEventPayload); overload;
    class procedure Validate(aToValidate: TPushNotifyUserEventPayload; aValidated: TList); overload;
    class procedure Validate(aToValidate: TGetMetadataInput); overload;
    class procedure Validate(aToValidate: TGetMetadataInput; aValidated: TList); overload;
    class procedure Validate(aToValidate: TGetMetadataOutput); overload;
    class procedure Validate(aToValidate: TGetMetadataOutput; aValidated: TList); overload;
    class procedure Validate(aToValidate: TBlobReference); overload;
    class procedure Validate(aToValidate: TBlobReference; aValidated: TList); overload;
    class procedure Validate(aToValidate: TBasicErrorPayload); overload;
    class procedure Validate(aToValidate: TBasicErrorPayload; aValidated: TList); overload;
    class procedure Validate(aToValidate: TDependency); overload;
    class procedure Validate(aToValidate: TDependency; aValidated: TList); overload;
    class procedure Validate(aToValidate: TGetDependenciesOutput); overload;
    class procedure Validate(aToValidate: TGetDependenciesOutput; aValidated: TList); overload;
  end;
  
implementation

uses
  SysUtils, TypInfo;

var
  vUserNotificationKindTypeInfo: PTypeInfo = nil;
  
  vUserNotificationPriorityTypeInfo: PTypeInfo = nil;
  
  vEventEmailFormatTypeInfo: PTypeInfo = nil;

{ TCommands }

class function TCommands.GetHello_World: String;
begin
  Result := 'helloWorld';
end;

class function TCommands.GetHello_World_Response: String;
begin
  Result := 'helloWorldResponse';
end;

class function TCommands.GetGet_Metadata: String;
begin
  Result := 'getMetadata';
end;

class function TCommands.GetGet_Metadata_Response: String;
begin
  Result := 'getMetadataResponse';
end;

class function TCommands.GetGet_Dependencies: String;
begin
  Result := 'getDependencies';
end;

class function TCommands.GetGet_Dependencies_Response: String;
begin
  Result := 'getDependenciesResponse';
end;

{ TEvents }

class function TEvents.GetService_Started: String;
begin
  Result := 'serviceStarted';
end;

class function TEvents.GetNotify_User_Event: String;
begin
  Result := 'notifyUserEvent';
end;

function Contains(aList: TList; aItem: TObject): Boolean;
var
  i: Integer;
begin
  Result := False;
  i := 0;
  while (i < aList.Count) and (not Result) do
  begin
    Result := aItem = aList[i];
    Inc(i);
  end;
end;


{ TNotifyUserEventPayload }

procedure TNotifyUserEventPayload.SetNotificationClass(aValue: String);
begin
  FNotificationClass := aValue;
  FNullNotificationClass := False;
end;

procedure TNotifyUserEventPayload.SetNotificationOrigin(aValue: String);
begin
  FNotificationOrigin := aValue;
  FNullNotificationOrigin := False;
end;

procedure TNotifyUserEventPayload.SetNotificationKind(aValue: TUserNotificationKind);
begin
  FNotificationKind := aValue;
  FNullNotificationKind := False;
end;

procedure TNotifyUserEventPayload.SetNotificationPriority(aValue: TUserNotificationPriority);
begin
  FNotificationPriority := aValue;
  FNullNotificationPriority := False;
end;

procedure TNotifyUserEventPayload.SetNotificationSubject(aValue: String);
begin
  FNotificationSubject := aValue;
  FNullNotificationSubject := False;
end;

procedure TNotifyUserEventPayload.SetNotificationContent(aValue: String);
begin
  FNotificationContent := aValue;
  FNullNotificationContent := False;
end;

procedure TNotifyUserEventPayload.SetSourceDomain(aValue: String);
begin
  FSourceDomain := aValue;
  FNullSourceDomain := False;
end;

procedure TNotifyUserEventPayload.SetSourceService(aValue: String);
begin
  FSourceService := aValue;
  FNullSourceService := False;
end;

procedure TNotifyUserEventPayload.SetDestinationUser(aValue: String);
begin
  FDestinationUser := aValue;
  FNullDestinationUser := False;
end;

procedure TNotifyUserEventPayload.SetLink(aValue: String);
begin
  FLink := aValue;
  FNullLink := False;
end;

procedure TNotifyUserEventPayload.AfterConstruction;
begin
  inherited;
  FNullNotificationClass := True;
  FNullNotificationOrigin := True;
  FNullNotificationKind := True;
  FNullNotificationPriority := True;
  FNullNotificationSubject := True;
  FNullNotificationContent := True;
  FNullSourceDomain := True;
  FNullSourceService := True;
  FNullDestinationUser := True;
  FNullLink := True;
end;

procedure TNotifyUserEventPayload.BeforeDestruction;
begin
  inherited;
end;

function TNotifyUserEventPayload.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function TNotifyUserEventPayload.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'NotificationClass') then
  begin
    Result := FNullNotificationClass;
    Exit;
  end;
  
  if SameText(aPropertyName, 'NotificationOrigin') then
  begin
    Result := FNullNotificationOrigin;
    Exit;
  end;
  
  if SameText(aPropertyName, 'NotificationKind') then
  begin
    Result := FNullNotificationKind;
    Exit;
  end;
  
  if SameText(aPropertyName, 'NotificationPriority') then
  begin
    Result := FNullNotificationPriority;
    Exit;
  end;
  
  if SameText(aPropertyName, 'NotificationSubject') then
  begin
    Result := FNullNotificationSubject;
    Exit;
  end;
  
  if SameText(aPropertyName, 'NotificationContent') then
  begin
    Result := FNullNotificationContent;
    Exit;
  end;
  
  if SameText(aPropertyName, 'SourceDomain') then
  begin
    Result := FNullSourceDomain;
    Exit;
  end;
  
  if SameText(aPropertyName, 'SourceService') then
  begin
    Result := FNullSourceService;
    Exit;
  end;
  
  if SameText(aPropertyName, 'DestinationUser') then
  begin
    Result := FNullDestinationUser;
    Exit;
  end;
  
  if SameText(aPropertyName, 'Link') then
  begin
    Result := FNullLink;
    Exit;
  end;
  
  Result := False;
end;

procedure TNotifyUserEventPayload.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure TNotifyUserEventPayload.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

{ TEmailNotifyUserEventPayload }

procedure TEmailNotifyUserEventPayload.SetFrom(aValue: String);
begin
  FFrom := aValue;
  FNullFrom := False;
end;

procedure TEmailNotifyUserEventPayload.SetFormat(aValue: TEventEmailFormat);
begin
  FFormat := aValue;
  FNullFormat := False;
end;

procedure TEmailNotifyUserEventPayload.AfterConstruction;
begin
  inherited;
  FNullFrom := True;
  FNullFormat := True;
  FSendTo := TSDLStringList.Create;
end;

procedure TEmailNotifyUserEventPayload.BeforeDestruction;
begin
  FreeAndNil(FSendTo);
  inherited;
end;

function TEmailNotifyUserEventPayload.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function TEmailNotifyUserEventPayload.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'From') then
  begin
    Result := FNullFrom;
    Exit;
  end;
  
  if SameText(aPropertyName, 'Format') then
  begin
    Result := FNullFormat;
    Exit;
  end;
  
  Result := False;
end;

procedure TEmailNotifyUserEventPayload.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure TEmailNotifyUserEventPayload.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

procedure TEmailNotifyUserEventPayload.AddSendTo(aItem: String);
begin
  FSendTo.Add(aItem);
end;		

function TEmailNotifyUserEventPayload.GetSendTo(aIndex: Integer): String;
begin
  Result := FSendTo[aIndex];
end;		

{ TPushNotifyUserEventPayload }

procedure TPushNotifyUserEventPayload.SetApplicationId(aValue: String);
begin
  FApplicationId := aValue;
  FNullApplicationId := False;
end;

procedure TPushNotifyUserEventPayload.AfterConstruction;
begin
  inherited;
  FNullApplicationId := True;
end;

procedure TPushNotifyUserEventPayload.BeforeDestruction;
begin
  inherited;
end;

function TPushNotifyUserEventPayload.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function TPushNotifyUserEventPayload.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'ApplicationId') then
  begin
    Result := FNullApplicationId;
    Exit;
  end;
  
  Result := False;
end;

procedure TPushNotifyUserEventPayload.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure TPushNotifyUserEventPayload.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

{ TBlobReference }

procedure TBlobReference.SetDomainName(aValue: String);
begin
  FDomainName := aValue;
  FNullDomainName := False;
end;

procedure TBlobReference.SetServiceName(aValue: String);
begin
  FServiceName := aValue;
  FNullServiceName := False;
end;

procedure TBlobReference.SetTargetObjectId(aValue: String);
begin
  FTargetObjectId := aValue;
  FNullTargetObjectId := False;
end;

procedure TBlobReference.SetTargetCopyId(aValue: String);
begin
  FTargetCopyId := aValue;
  FNullTargetCopyId := False;
end;

procedure TBlobReference.AfterConstruction;
begin
  inherited;
  FNullDomainName := True;
  FNullServiceName := True;
  FNullTargetObjectId := True;
  FNullTargetCopyId := True;
end;

procedure TBlobReference.BeforeDestruction;
begin
  inherited;
end;

function TBlobReference.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function TBlobReference.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'DomainName') then
  begin
    Result := FNullDomainName;
    Exit;
  end;
  
  if SameText(aPropertyName, 'ServiceName') then
  begin
    Result := FNullServiceName;
    Exit;
  end;
  
  if SameText(aPropertyName, 'TargetObjectId') then
  begin
    Result := FNullTargetObjectId;
    Exit;
  end;
  
  if SameText(aPropertyName, 'TargetCopyId') then
  begin
    Result := FNullTargetCopyId;
    Exit;
  end;
  
  Result := False;
end;

procedure TBlobReference.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure TBlobReference.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

{ TBasicErrorPayload }

procedure TBasicErrorPayload.SetMessage(aValue: String);
begin
  FMessage := aValue;
  FNullMessage := False;
end;

procedure TBasicErrorPayload.SetErrorCode(aValue: String);
begin
  FErrorCode := aValue;
  FNullErrorCode := False;
end;

procedure TBasicErrorPayload.AfterConstruction;
begin
  inherited;
  FNullMessage := True;
  FNullErrorCode := True;
end;

procedure TBasicErrorPayload.BeforeDestruction;
begin
  inherited;
end;

function TBasicErrorPayload.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function TBasicErrorPayload.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'Message') then
  begin
    Result := FNullMessage;
    Exit;
  end;
  
  if SameText(aPropertyName, 'ErrorCode') then
  begin
    Result := FNullErrorCode;
    Exit;
  end;
  
  Result := False;
end;

procedure TBasicErrorPayload.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure TBasicErrorPayload.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

{ TDependency }

procedure TDependency.SetDomain(aValue: String);
begin
  FDomain := aValue;
  FNullDomain := False;
end;

procedure TDependency.SetService(aValue: String);
begin
  FService := aValue;
  FNullService := False;
end;

procedure TDependency.SetVersion(aValue: String);
begin
  FVersion := aValue;
  FNullVersion := False;
end;

procedure TDependency.AfterConstruction;
begin
  inherited;
  FNullDomain := True;
  FNullService := True;
  FNullVersion := True;
end;

procedure TDependency.BeforeDestruction;
begin
  inherited;
end;

function TDependency.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function TDependency.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'Domain') then
  begin
    Result := FNullDomain;
    Exit;
  end;
  
  if SameText(aPropertyName, 'Service') then
  begin
    Result := FNullService;
    Exit;
  end;
  
  if SameText(aPropertyName, 'Version') then
  begin
    Result := FNullVersion;
    Exit;
  end;
  
  Result := False;
end;

procedure TDependency.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure TDependency.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;


{ THelloWorldInput }

procedure THelloWorldInput.SetWho(aValue: String);
begin
  FWho := aValue;
  FNullWho := False;
end;

procedure THelloWorldInput.AfterConstruction;
begin
  inherited;
  FNullWho := True;
end;

procedure THelloWorldInput.BeforeDestruction;
begin
  inherited;
end;

function THelloWorldInput.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function THelloWorldInput.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'Who') then
  begin
    Result := FNullWho;
    Exit;
  end;
  
  Result := False;
end;

procedure THelloWorldInput.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure THelloWorldInput.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

{ THelloWorldOutput }

procedure THelloWorldOutput.SetHelloWorldMessage(aValue: String);
begin
  FHelloWorldMessage := aValue;
  FNullHelloWorldMessage := False;
end;

procedure THelloWorldOutput.AfterConstruction;
begin
  inherited;
  FNullHelloWorldMessage := True;
end;

procedure THelloWorldOutput.BeforeDestruction;
begin
  inherited;
end;

function THelloWorldOutput.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function THelloWorldOutput.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'HelloWorldMessage') then
  begin
    Result := FNullHelloWorldMessage;
    Exit;
  end;
  
  Result := False;
end;

procedure THelloWorldOutput.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure THelloWorldOutput.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

{ TGetMetadataInput }

procedure TGetMetadataInput.SetMetadataFormat(aValue: String);
begin
  FMetadataFormat := aValue;
  FNullMetadataFormat := False;
end;

procedure TGetMetadataInput.AfterConstruction;
begin
  inherited;
  FNullMetadataFormat := True;
end;

procedure TGetMetadataInput.BeforeDestruction;
begin
  inherited;
end;

function TGetMetadataInput.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function TGetMetadataInput.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'MetadataFormat') then
  begin
    Result := FNullMetadataFormat;
    Exit;
  end;
  
  Result := False;
end;

procedure TGetMetadataInput.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure TGetMetadataInput.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

{ TGetMetadataOutput }

procedure TGetMetadataOutput.SetMetadata(aValue: String);
begin
  FMetadata := aValue;
  FNullMetadata := False;
end;

procedure TGetMetadataOutput.AfterConstruction;
begin
  inherited;
  FNullMetadata := True;
end;

procedure TGetMetadataOutput.BeforeDestruction;
begin
  inherited;
end;

function TGetMetadataOutput.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function TGetMetadataOutput.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'Metadata') then
  begin
    Result := FNullMetadata;
    Exit;
  end;
  
  Result := False;
end;

procedure TGetMetadataOutput.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure TGetMetadataOutput.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

{ TGetDependenciesOutput }

procedure TGetDependenciesOutput.AfterConstruction;
begin
  inherited;
  FDependencies := TSDLObjectList.Create(TDependency);
end;

procedure TGetDependenciesOutput.BeforeDestruction;
begin
  FreeAndNil(FDependencies);
  inherited;
end;

function TGetDependenciesOutput.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function TGetDependenciesOutput.IsNullProperty(aPropertyName: String): Boolean;
begin
  Result := False;
end;

procedure TGetDependenciesOutput.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure TGetDependenciesOutput.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

procedure TGetDependenciesOutput.AddDependencies(aItem: TDependency);
begin
  FDependencies.Add(aItem);
end;		

function TGetDependenciesOutput.GetDependencies(aIndex: Integer): TDependency;
begin
  Result := TDependency(FDependencies[aIndex]);
end;		

{ TServiceStartedPayload }

procedure TServiceStartedPayload.SetDomain(aValue: String);
begin
  FDomain := aValue;
  FNullDomain := False;
end;

procedure TServiceStartedPayload.SetService(aValue: String);
begin
  FService := aValue;
  FNullService := False;
end;

procedure TServiceStartedPayload.AfterConstruction;
begin
  inherited;
  FNullDomain := True;
  FNullService := True;
end;

procedure TServiceStartedPayload.BeforeDestruction;
begin
  inherited;
end;

function TServiceStartedPayload.GetContext: String;
begin
  Result := cDomain + '.' + cService;
end;

function TServiceStartedPayload.IsNullProperty(aPropertyName: String): Boolean;
begin
  if SameText(aPropertyName, 'Domain') then
  begin
    Result := FNullDomain;
    Exit;
  end;
  
  if SameText(aPropertyName, 'Service') then
  begin
    Result := FNullService;
    Exit;
  end;
  
  Result := False;
end;

procedure TServiceStartedPayload.Validate;
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(xValidated);
  finally
    xValidated.Destroy;
  end;
end;

procedure TServiceStartedPayload.Validate(aValidated: TList);
begin
  TMyServiceValidator.Validate(self, aValidated);
end;

{ TMyServiceValidator }
  
class procedure TMyServiceValidator.Validate(aToValidate: THelloWorldInput);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: THelloWorldInput; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  if (aToValidate.WhoIsNull) then
    raise EIllegalArgumentException.Create('Who is required');    
end;

class procedure TMyServiceValidator.Validate(aToValidate: THelloWorldOutput);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: THelloWorldOutput; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  if (aToValidate.HelloWorldMessageIsNull) then
    raise EIllegalArgumentException.Create('HelloWorldMessage is required');    
end;

class procedure TMyServiceValidator.Validate(aToValidate: TServiceStartedPayload);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: TServiceStartedPayload; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  if (aToValidate.DomainIsNull) then
    raise EIllegalArgumentException.Create('Domain is required');    
  if (aToValidate.ServiceIsNull) then
    raise EIllegalArgumentException.Create('Service is required');    
end;

class procedure TMyServiceValidator.Validate(aToValidate: TNotifyUserEventPayload);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: TNotifyUserEventPayload; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  if (aToValidate.NotificationKindIsNull) then
    raise EIllegalArgumentException.Create('NotificationKind is required');    
  if (aToValidate.NotificationPriorityIsNull) then
    raise EIllegalArgumentException.Create('NotificationPriority is required');    
  if (aToValidate.NotificationSubjectIsNull) then
    raise EIllegalArgumentException.Create('NotificationSubject is required');    
  if (aToValidate.NotificationContentIsNull) then
    raise EIllegalArgumentException.Create('NotificationContent is required');    
  if (aToValidate.SourceDomainIsNull) then
    raise EIllegalArgumentException.Create('SourceDomain is required');    
  if (aToValidate.SourceServiceIsNull) then
    raise EIllegalArgumentException.Create('SourceService is required');    
  if (aToValidate.DestinationUserIsNull) then
    raise EIllegalArgumentException.Create('DestinationUser is required');    
end;

class procedure TMyServiceValidator.Validate(aToValidate: TEmailNotifyUserEventPayload);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: TEmailNotifyUserEventPayload; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  Validate(TNotifyUserEventPayload(aToValidate), aValidated);
  if (aToValidate.FromIsNull) then
    raise EIllegalArgumentException.Create('From is required');    
end;

class procedure TMyServiceValidator.Validate(aToValidate: TPushNotifyUserEventPayload);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: TPushNotifyUserEventPayload; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  Validate(TNotifyUserEventPayload(aToValidate), aValidated);
  if (aToValidate.ApplicationIdIsNull) then
    raise EIllegalArgumentException.Create('ApplicationId is required');    
end;

class procedure TMyServiceValidator.Validate(aToValidate: TGetMetadataInput);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: TGetMetadataInput; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  // no validation required
end;

class procedure TMyServiceValidator.Validate(aToValidate: TGetMetadataOutput);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: TGetMetadataOutput; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  if (aToValidate.MetadataIsNull) then
    raise EIllegalArgumentException.Create('Metadata is required');    
end;

class procedure TMyServiceValidator.Validate(aToValidate: TBlobReference);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: TBlobReference; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  if (aToValidate.TargetObjectIdIsNull) then
    raise EIllegalArgumentException.Create('TargetObjectId is required');    
end;

class procedure TMyServiceValidator.Validate(aToValidate: TBasicErrorPayload);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: TBasicErrorPayload; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  // no validation required
end;

class procedure TMyServiceValidator.Validate(aToValidate: TDependency);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: TDependency; aValidated: TList);
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  if (aToValidate.DomainIsNull) then
    raise EIllegalArgumentException.Create('Domain is required');    
  if (aToValidate.ServiceIsNull) then
    raise EIllegalArgumentException.Create('Service is required');    
  if (aToValidate.VersionIsNull) then
    raise EIllegalArgumentException.Create('Version is required');    
end;

class procedure TMyServiceValidator.Validate(aToValidate: TGetDependenciesOutput);
var
  xValidated: TList;
begin
  xValidated := TList.Create;
  try
    Validate(aToValidate, xValidated);
  finally
    xValidated.Destroy;
  end;
end;

class procedure TMyServiceValidator.Validate(aToValidate: TGetDependenciesOutput; aValidated: TList);
var
  i: Integer;
begin
  if Contains(aValidated, aToValidate) then
    Exit;
  aValidated.Add(aToValidate);
  if (aToValidate.Dependencies = nil) or (aToValidate.Dependencies.Count = 0) then
    raise EIllegalArgumentException.Create('dependencies is required, at least one value must be present');
  for i := 0 to aToValidate.Dependencies.Count - 1 do
    Validate(TDependency(aToValidate.Dependencies[i]), aValidated);
end;

type

  { TMy_domain_My_serviceTypeInfoHelper }

  TMy_domain_My_serviceTypeInfoHelper = class(TPersistent)
  private
    FUserNotificationKind: TUserNotificationKind;
    FUserNotificationPriority: TUserNotificationPriority;
    FEventEmailFormat: TEventEmailFormat;
  published
    property UserNotificationKind: TUserNotificationKind read FUserNotificationKind;
    property UserNotificationPriority: TUserNotificationPriority read FUserNotificationPriority;
    property EventEmailFormat: TEventEmailFormat read FEventEmailFormat;
  end;

procedure InitializeTypeInfos;
begin
  vUserNotificationKindTypeInfo := GetPropInfo(TMy_domain_My_serviceTypeInfoHelper, 'UserNotificationKind').PropType^;
  
  vUserNotificationPriorityTypeInfo := GetPropInfo(TMy_domain_My_serviceTypeInfoHelper, 'UserNotificationPriority').PropType^;
  
  vEventEmailFormatTypeInfo := GetPropInfo(TMy_domain_My_serviceTypeInfoHelper, 'EventEmailFormat').PropType^;
end;

initialization

  RegisterJsonClass('my_domain.my_service', TBasicErrorPayload);
  RegisterJsonClass('my_domain.my_service', TBlobReference);
  RegisterJsonClass('my_domain.my_service', TDependency);
  RegisterJsonClass('my_domain.my_service', TEmailNotifyUserEventPayload);
  RegisterJsonClass('my_domain.my_service', TGetDependenciesOutput);
  RegisterJsonClass('my_domain.my_service', TGetMetadataInput);
  RegisterJsonClass('my_domain.my_service', TGetMetadataOutput);
  RegisterJsonClass('my_domain.my_service', THelloWorldInput);
  RegisterJsonClass('my_domain.my_service', THelloWorldOutput);
  RegisterJsonClass('my_domain.my_service', TNotifyUserEventPayload);
  RegisterJsonClass('my_domain.my_service', TPushNotifyUserEventPayload);
  RegisterJsonClass('my_domain.my_service', TServiceStartedPayload);
  
  InitializeTypeInfos;
  
  RegisterEnum(vUserNotificationKindTypeInfo, cUserNotificationKindNames, 'my_domain.my_service');
  RegisterEnum(vUserNotificationPriorityTypeInfo, cUserNotificationPriorityNames, 'my_domain.my_service');
  RegisterEnum(vEventEmailFormatTypeInfo, cEventEmailFormatNames, 'my_domain.my_service');
  
end.

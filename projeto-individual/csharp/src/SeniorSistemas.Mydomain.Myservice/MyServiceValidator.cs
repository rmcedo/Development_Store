namespace SeniorSistemas.Mydomain.Myservice
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    
    ///<summary>Validators for payloads accepted/produced by endpoints in my_service</summary>
    public class MyServiceValidator
    {
        public static void Validate(HelloWorldInput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(HelloWorldInput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Who == null)
            {
                throw new ArgumentException("Who is required");
            }
        }
        public static void Validate(HelloWorldOutput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(HelloWorldOutput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.HelloWorldMessage == null)
            {
                throw new ArgumentException("HelloWorldMessage is required");
            }
        }
        public static void Validate(ServiceStartedPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(ServiceStartedPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Domain == null)
            {
                throw new ArgumentException("Domain is required");
            }
            if (toValidate.Service == null)
            {
                throw new ArgumentException("Service is required");
            }
        }
        public static void Validate(NotifyUserEventPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(NotifyUserEventPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.NotificationKind == null)
            {
                throw new ArgumentException("NotificationKind is required");
            }
            if (toValidate.NotificationPriority == null)
            {
                throw new ArgumentException("NotificationPriority is required");
            }
            if (toValidate.NotificationSubject == null)
            {
                throw new ArgumentException("NotificationSubject is required");
            }
            if (toValidate.NotificationContent == null)
            {
                throw new ArgumentException("NotificationContent is required");
            }
            if (toValidate.SourceDomain == null)
            {
                throw new ArgumentException("SourceDomain is required");
            }
            if (toValidate.SourceService == null)
            {
                throw new ArgumentException("SourceService is required");
            }
            if (toValidate.DestinationUser == null)
            {
                throw new ArgumentException("DestinationUser is required");
            }
        }
        public static void Validate(EmailNotifyUserEventPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(EmailNotifyUserEventPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.NotificationKind == null)
            {
                throw new ArgumentException("NotificationKind is required");
            }
            if (toValidate.NotificationPriority == null)
            {
                throw new ArgumentException("NotificationPriority is required");
            }
            if (toValidate.NotificationSubject == null)
            {
                throw new ArgumentException("NotificationSubject is required");
            }
            if (toValidate.NotificationContent == null)
            {
                throw new ArgumentException("NotificationContent is required");
            }
            if (toValidate.SourceDomain == null)
            {
                throw new ArgumentException("SourceDomain is required");
            }
            if (toValidate.SourceService == null)
            {
                throw new ArgumentException("SourceService is required");
            }
            if (toValidate.DestinationUser == null)
            {
                throw new ArgumentException("DestinationUser is required");
            }
            if (toValidate.From == null)
            {
                throw new ArgumentException("From is required");
            }
        }
        public static void Validate(PushNotifyUserEventPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(PushNotifyUserEventPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.NotificationKind == null)
            {
                throw new ArgumentException("NotificationKind is required");
            }
            if (toValidate.NotificationPriority == null)
            {
                throw new ArgumentException("NotificationPriority is required");
            }
            if (toValidate.NotificationSubject == null)
            {
                throw new ArgumentException("NotificationSubject is required");
            }
            if (toValidate.NotificationContent == null)
            {
                throw new ArgumentException("NotificationContent is required");
            }
            if (toValidate.SourceDomain == null)
            {
                throw new ArgumentException("SourceDomain is required");
            }
            if (toValidate.SourceService == null)
            {
                throw new ArgumentException("SourceService is required");
            }
            if (toValidate.DestinationUser == null)
            {
                throw new ArgumentException("DestinationUser is required");
            }
            if (toValidate.ApplicationId == null)
            {
                throw new ArgumentException("ApplicationId is required");
            }
        }
        public static void Validate(GetMetadataInput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(GetMetadataInput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            // no validation required
        }
        public static void Validate(GetMetadataOutput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(GetMetadataOutput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Metadata == null)
            {
                throw new ArgumentException("Metadata is required");
            }
        }
        public static void Validate(BlobReference toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(BlobReference toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.TargetObjectId == null)
            {
                throw new ArgumentException("TargetObjectId is required");
            }
        }
        public static void Validate(BasicErrorPayload toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(BasicErrorPayload toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            // no validation required
        }
        public static void Validate(Dependency toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(Dependency toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Domain == null)
            {
                throw new ArgumentException("Domain is required");
            }
            if (toValidate.Service == null)
            {
                throw new ArgumentException("Service is required");
            }
            if (toValidate.Version == null)
            {
                throw new ArgumentException("Version is required");
            }
        }
        public static void Validate(GetDependenciesOutput toValidate)
        {
        	Validate(toValidate, new ArrayList());
        }
        
        internal static void Validate(GetDependenciesOutput toValidate, IList validated)
        {
        	if (validated.Contains(toValidate))
        	{
        		return;
        	}
        	validated.Add(toValidate);
            if (toValidate.Dependencies == null || toValidate.Dependencies.Count == 0)
            {
                throw new ArgumentException("Dependencies is required, at least one value must be present");
            }
            foreach (Dependency it in toValidate.Dependencies)
            {
                it.Validate(validated);
            }
        }
    }
}

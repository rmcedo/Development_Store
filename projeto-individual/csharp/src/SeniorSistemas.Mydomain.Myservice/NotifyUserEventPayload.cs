namespace SeniorSistemas.Mydomain.Myservice
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Represents a regular user event notification payload
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "33.3.7")]
    public class NotifyUserEventPayload
    {
        
        ///<summary>
        /// Class of notification
        ///</summary>
        public string NotificationClass { get; set; }
        
        ///<summary>
        /// Origin of notification. Free text. Optional.
        ///</summary>
        public string NotificationOrigin { get; set; }
        
        ///<summary>
        /// Notification kind.
        ///</summary>
        public UserNotificationKind? NotificationKind { get; set; }
        
        ///<summary>
        /// Notification priority.
        ///</summary>
        public UserNotificationPriority? NotificationPriority { get; set; }
        
        ///<summary>
        /// Notification subject.
        ///</summary>
        public string NotificationSubject { get; set; }
        
        ///<summary>
        /// Notification content.
        ///</summary>
        public string NotificationContent { get; set; }
        
        ///<summary>
        /// Domain that generates the notification.
        ///</summary>
        public string SourceDomain { get; set; }
        
        ///<summary>
        /// Service that generates the notification.
        ///</summary>
        public string SourceService { get; set; }
        
        ///<summary>
        /// Username of the destination user.
        ///</summary>
        public string DestinationUser { get; set; }
        
        ///<summary>
        /// Notification link
        ///</summary>
        public string Link { get; set; }
        
        /// <summary>
        /// Constructor for NotifyUserEventPayload
        /// </summary>
        /// <param name="notificationKind">
        ///<summary>
        /// Notification kind.
        ///</summary>
        /// </param>
        /// <param name="notificationPriority">
        ///<summary>
        /// Notification priority.
        ///</summary>
        /// </param>
        /// <param name="notificationSubject">
        ///<summary>
        /// Notification subject.
        ///</summary>
        /// </param>
        /// <param name="notificationContent">
        ///<summary>
        /// Notification content.
        ///</summary>
        /// </param>
        /// <param name="sourceDomain">
        ///<summary>
        /// Domain that generates the notification.
        ///</summary>
        /// </param>
        /// <param name="sourceService">
        ///<summary>
        /// Service that generates the notification.
        ///</summary>
        /// </param>
        /// <param name="destinationUser">
        ///<summary>
        /// Username of the destination user.
        ///</summary>
        /// </param>
        public NotifyUserEventPayload(UserNotificationKind? notificationKind, UserNotificationPriority? notificationPriority, string notificationSubject, string notificationContent, string sourceDomain, string sourceService, string destinationUser)
        {
            this.NotificationKind = notificationKind;
            this.NotificationPriority = notificationPriority;
            this.NotificationSubject = notificationSubject;
            this.NotificationContent = notificationContent;
            this.SourceDomain = sourceDomain;
            this.SourceService = sourceService;
            this.DestinationUser = destinationUser;
        }
        
        public virtual void Validate()
        {
        	Validate(new ArrayList());
        }
        
        internal virtual void Validate(IList validated)
        {
            MyServiceValidator.Validate(this, validated);
        }
    }
}

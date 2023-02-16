namespace SeniorSistemas.Mydomain.Myservice
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Represents a push notification payload
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "33.3.7")]
    public class PushNotifyUserEventPayload : NotifyUserEventPayload
    {
        
        ///<summary>
        /// Apple/Google application id
        ///</summary>
        public string ApplicationId { get; set; }
        
        /// <summary>
        /// Constructor for PushNotifyUserEventPayload
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
        /// <param name="applicationId">
        ///<summary>
        /// Apple/Google application id
        ///</summary>
        /// </param>
        public PushNotifyUserEventPayload(UserNotificationKind? notificationKind, UserNotificationPriority? notificationPriority, string notificationSubject, string notificationContent, string sourceDomain, string sourceService, string destinationUser, string applicationId) : base(notificationKind, notificationPriority, notificationSubject, notificationContent, sourceDomain, sourceService, destinationUser)
        {
            this.ApplicationId = applicationId;
        }
        
        public override void Validate()
        {
        	Validate(new ArrayList());
        }
        
        internal override void Validate(IList validated)
        {
            MyServiceValidator.Validate(this, validated);
        }
    }
}

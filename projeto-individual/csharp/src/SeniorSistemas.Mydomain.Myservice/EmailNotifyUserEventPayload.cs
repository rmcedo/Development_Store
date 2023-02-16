namespace SeniorSistemas.Mydomain.Myservice
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Represents an email notification payload
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "33.3.7")]
    public class EmailNotifyUserEventPayload : NotifyUserEventPayload
    {
        
        ///<summary>
        /// Email sender address
        ///</summary>
        public string From { get; set; }
        
        ///<summary>
        /// Additional recipients to send the email to
        ///</summary>
        public IList<string> SendTo { get; set; }
        
        ///<summary>
        /// Email format
        ///</summary>
        public EventEmailFormat? Format { get; set; }
        
        /// <summary>
        /// Constructor for EmailNotifyUserEventPayload
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
        /// <param name="from">
        ///<summary>
        /// Email sender address
        ///</summary>
        /// </param>
        public EmailNotifyUserEventPayload(UserNotificationKind? notificationKind, UserNotificationPriority? notificationPriority, string notificationSubject, string notificationContent, string sourceDomain, string sourceService, string destinationUser, string from) : base(notificationKind, notificationPriority, notificationSubject, notificationContent, sourceDomain, sourceService, destinationUser)
        {
            this.From = from;
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

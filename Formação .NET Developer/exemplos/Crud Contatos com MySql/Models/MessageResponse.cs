using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Schedule.Models
{
    public class MessageResponse
    {
        public MessageResponse(){

        }

        public MessageResponse(string message, int statusCode, DateTime dateOfOccurrence){
            Message = message;
            StatusCode = statusCode;
            DateOfOccurrence = dateOfOccurrence;
        }

        public string Message { get; set; }
        public int StatusCode { get; set; }
        public DateTime DateOfOccurrence { get; set; }

    }
}
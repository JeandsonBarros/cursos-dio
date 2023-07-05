using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Schedule.Models
{
    public class User
    {
        public int Id { get; set;}
        public string Name { get; set; }
        public string Email { get; set; }
        public string Password { get; set; }
        public EnumRole Role { get; set; } 
    }
}
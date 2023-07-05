using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using Schedule.Models;

namespace Schedule.Context
{
    public class ScheduleContext : DbContext
    {
        public ScheduleContext(DbContextOptions<ScheduleContext> options): base(options){

        }

        public DbSet<Contact> Contact {get; set; }
        public DbSet<User> User {get; set; }

    }
}
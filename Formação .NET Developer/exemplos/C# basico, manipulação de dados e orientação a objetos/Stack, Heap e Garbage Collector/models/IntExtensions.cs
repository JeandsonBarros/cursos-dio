using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Models
{
    public static class IntExtensions
    {
        public static bool EhPar(this int value)
        {
            return value % 2 == 0;
        }
    }

}
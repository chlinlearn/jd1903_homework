package com.briup.enums;
/* *
 *@author:xuchunlin
 *@createTime:2019/6/18/16:44
 */

public enum Week {
    Monday{
        @Override
        public Week next() {
            return Week.Tuesday;
        }
    },Tuesday{
        @Override
        public Week next() {
            return Week.Wednesday;
        }
    },Wednesday{
        @Override
        public Week next() {
            return Week.Thursday;
        }
    },Thursday{
        @Override
        public Week next() {
            return Week.Friday;
        }
    },Friday{
        @Override
        public Week next() {
            return Week.Saturday;
        }
    },Saturday{
        @Override
        public Week next() {
            return Week.Sunday;
        }
    },Sunday{
        @Override
        public Week next() {
            return Week.Friday;
        }
    };

    public abstract Week next();

    public static void main(String[] args) {
        Week w = Week.Monday;
        System.out.println(w.next().next());
    }

}

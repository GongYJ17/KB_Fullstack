const gongObj = {
    name: '공연정',
    sayHello : function() {
        console.log(this.name);
    },
    nestedObj: {
        name: '공연경',
        sayHello: funciton() {
            console.log(this.name);
        }
    }
}

gongObj.sayHello()
gongObj.nestedObj.sayHello()
class Calculator {
    constructor() {

        this.storedNum = undefined;
        this.storedOperator = null;
        this.screen = document.querySelector(".number p")
        this.stored = null

        document.querySelectorAll('button').forEach(elm => elm.addEventListener('click', () => {

            switch (elm.id) {

                case "+": this.getOperator('+'); break
                case "-": this.getOperator('-'); break
                case "x": this.getOperator('x'); break
                case "/": this.getOperator('/'); break

                case "c": this.clear(); break
                case "=": this.operate(); break

                default:
                    if (this.storedOperator === 'clear' || this.screen.innerText == 0 || this.stored === true) {
                        this.setScreen('')
                        this.stored = false
                    }

                    this.screen.innerText += elm.id
            }
        }))
    }


    operate() {
        switch (this.storedOperator) {
            case "+": this.sum(); break
            case "-": this.rest(); break
            case "x": this.mult(); break
            case "/": this.divid(); break
        }

        this.storedNum = this.getScreenNum()
        this.storedOperator = 'clear'
    }

    sum() {
        this.setScreen(parseInt(this.storedNum) + this.getScreenNum())
    }

    rest() {
        this.setScreen(parseInt(this.storedNum) - this.getScreenNum())
    }

    mult() {
        this.setScreen(parseInt(this.storedNum) * this.getScreenNum())
    }

    divid() {
        this.getScreen() == 0 ? this.setScreen("Can't divide by 0")
            : this.setScreen(parseInt(this.storedNum) / parseInt(this.screen.innerText))
    }

    clear() {
        this.storedNum = undefined;
        this.storedOperator = null
        this.setScreen(0)
    }

    getScreen() {
        return this.screen.innerText
    }

    getScreenNum() {
        return parseInt(this.screen.innerText)
    }

    setScreen(num) {
        this.screen.innerText = num
    }

    getOperator(operator) {
        if (this.storedOperator && this.storedNum) {
            this.operate()
        }
        this.storedOperator = operator
        this.storedNum = this.getScreenNum()
        this.stored = true
    }
}

new Calculator()
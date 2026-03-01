require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Здравствуйте

    state: Bye
        intent!: /пока
        a: Пока пока

    state: marko
        q!: погода
        go!: /polo
    state: polo
        a: Сейчас солнечно, температура +20°C

    state: marko3
        q!: прогноз
        go!: /polo3
    state: polo3
        a: Сейчас солнечно, температура +20°C

    state: marko4
        q!: температура
        go!: /polo4
    state: polo4
        a: Сейчас солнечно, температура +20°C

    state: marko1
        q!: валюта
        go!: /polo1
    state: polo1
        a: Курс доллара: 92.50 руб., евро: 99.80 руб.

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}
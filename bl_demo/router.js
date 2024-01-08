const bl = require('bl')

const logger = require('../logger/my_logger')

router.delete('/:id', async (request, response) => {
    try {
        const user_id = parseInt(request.params.id)

        // router should talk to bl and not to dal !!!!
        // const result = await dal.delete_employee(user_id) -- bad idea!
        const result = await bl.delete_employee(user_id)
        response.status(204).json({ result })
    }
    catch (e) {
        logger.error(`Error during delete ${JSON.stringify(e)}`)
        response.status(400).json({ 'Error': e })
    }
})

module.exports = router

